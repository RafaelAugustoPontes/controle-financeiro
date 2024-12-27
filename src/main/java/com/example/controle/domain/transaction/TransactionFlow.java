package com.example.controle.domain.transaction;

import com.example.controle.domain.flow.FlowBase;
import com.example.controle.domain.flow.RuleBase;

public class TransactionFlow extends FlowBase {

    public static final String NAME = "TransactionFlow";
    private final TransactionRulesSpec rules;

    public TransactionFlow(TransactionRulesSpec rules) {
        this.rules = rules;
    }

    @Override
    public RuleBase buildRules() {
        RuleBase loader = rules.validateTest();
        RuleBase chain = rules.validateTest()
            .next(rules.validateTestOther());
        loader.next(chain);
        
        return loader;
    }

    @Override
    public void execute() {
    }

}
