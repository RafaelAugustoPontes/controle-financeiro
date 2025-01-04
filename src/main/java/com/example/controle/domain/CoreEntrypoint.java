package com.example.controle.domain;

import org.springframework.stereotype.Component;

import com.example.controle.domain.flow.FlowBase;
import com.example.controle.domain.flow.FlowContext;
import com.example.controle.domain.flow.FlowFactory;
import com.example.controle.domain.message.SystemMessage;
import com.example.controle.domain.message.SystemResponse;
import com.example.controle.domain.rules.RuleResult;
import com.example.controle.domain.transaction.TransactionFlow;
import com.example.controle.domain.transaction.TransactionRules;
import com.example.controle.ports.inbound.SystemEntrypoint;
import com.example.controle.ports.outbond.DatabasePort;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CoreEntrypoint implements SystemEntrypoint {

    private final FlowFactory flowFactory;
    private final DatabasePort databasePort;

    public CoreEntrypoint(FlowFactory flowFactory, final DatabasePort databasePort) {
        this.flowFactory = flowFactory;
        this.databasePort = databasePort;
    }

    @Override
    public SystemResponse execute(final SystemMessage systemMessage) {
        try {
            final var message = systemMessage.getMessage();
            FlowBase flow = flowFactory.get(systemMessage.getHeader().getFlowId());
            FlowContext context = new FlowContext(databasePort, message);
    
            RuleResult result = flow.validate(context);
            if (!result.isSuccess()) {
                return SystemResponse.ofBusinessError(result.getMessage());
            }
    
            flow.executeDefault(context);
            return SystemResponse.ofSuccess(null); // TODO adicionar retorno pode ser em um map dentro do context
        } catch (Exception e) {
            log.error("Erro ao executar o flow {}", systemMessage.getHeader().getFlowId());
            e.printStackTrace();
            return SystemResponse.ofException();
        }
    }

    public void init() {
        flowFactory.register(TransactionFlow.NAME, new TransactionFlow(new TransactionRules()));
    }

    public void report() {
        flowFactory.report();
    }

}
