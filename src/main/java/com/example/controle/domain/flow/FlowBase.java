package com.example.controle.domain.flow;

import com.example.controle.domain.transaction.TransactionRules;

public abstract class FlowBase {

    public FlowResult executeDefault() {
        RuleBase rules = buildRules();
        var result = rules.evaluate(null);
        if (result.isSuccess()) {
            ex
        }
        return null;
    }

    public abstract RuleBase buildRules();

    public abstract void execute();

    public static void main(String[] args) {
        TransactionRules rules = new TransactionRules();
        RuleBase loader = rules.validateTest();
        RuleBase chain = rules.validateTest()
            .next(rules.validateTestOther());
        loader.next(chain);
        loader.execute(null);
    }

}
