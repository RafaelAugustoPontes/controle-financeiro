package com.example.controle.domain;

import org.springframework.stereotype.Component;

import com.example.controle.domain.flow.FlowBase;
import com.example.controle.domain.flow.FlowContext;
import com.example.controle.domain.flow.FlowFactory;
import com.example.controle.domain.message.SystemMessage;
import com.example.controle.domain.rules.RuleResult;
import com.example.controle.domain.transaction.TransactionFlow;
import com.example.controle.domain.transaction.TransactionRules;
import com.example.controle.ports.outbond.DatabasePort;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CoreEntrypoint {

    private final FlowFactory flowFactory;
    private DatabasePort databasePort;

    public CoreEntrypoint(FlowFactory flowFactory, final DatabasePort databasePort) {
        this.flowFactory = flowFactory;
        this.databasePort = databasePort;
    }

    public void execute(final SystemMessage systemMessage) {
        final var message = systemMessage.getMessage();
        FlowBase flow = flowFactory.get(message.getHeader().getFlowId());
        FlowContext context = new FlowContext(databasePort, message);

        RuleResult result = flow.buildRules().evaluate(context);
        if (result.isSuccess()) {
            //TODO Verificar retorno
            flow.execute(context);
        }
    }

    public void init() {
        // registra em memória os fluxos na inicialização
        flowFactory.register(TransactionFlow.NAME, new TransactionFlow(new TransactionRules()));
    }

    public void report() {
        flowFactory.report();
    }

}
