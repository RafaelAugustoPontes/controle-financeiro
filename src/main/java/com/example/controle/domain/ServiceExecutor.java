package com.example.controle.domain;

import org.springframework.stereotype.Service;

import com.example.controle.domain.flow.FlowFactory;
import com.example.controle.domain.transaction.TransactionFlow;
import com.example.controle.domain.transaction.TransactionRules;

@Service
public class ServiceExecutor {

    private final FlowFactory flowFactory;

    public ServiceExecutor(FlowFactory flowFactory) {
        this.flowFactory = flowFactory;
    }

    public void init() {
        // registra em memória os fluxos na inicialização
        flowFactory.register(TransactionFlow.NAME, new TransactionFlow(new TransactionRules()));
    }

    public void report() {
        flowFactory.report();
    }

}
