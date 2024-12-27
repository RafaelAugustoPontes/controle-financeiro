package com.example.controle.domain.transaction;

import com.example.controle.domain.flow.FlowBase;
import com.example.controle.domain.flow.FlowContextSpec;
import com.example.controle.domain.rules.RuleBase;

public class TransactionFlow extends FlowBase {

    public static final String NAME = "TransactionFlow";
    private final TransactionRulesSpec rules;

    public TransactionFlow(TransactionRulesSpec rules) {
        this.rules = rules;
    }

    @Override
    public RuleBase buildRules() {
        RuleBase loader = RuleBase.getLoader();
        RuleBase chain = rules.validateTest()
            .next(rules.validateTestOther())
            .next(rules.validateValue())
            ;
        loader.next(chain);
        
        return loader;
    }

    @Override
    public void execute(final FlowContextSpec context) {
        // acionado após validação com sucesso. Grava na databaseport
    }

}
