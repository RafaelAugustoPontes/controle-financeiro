package com.example.controle.domain.flow;

import com.example.controle.domain.rules.RuleBase;

public abstract class FlowBase {

    public FlowResult executeDefault(final FlowContextSpec context) {
        RuleBase rules = buildRules();
        var result = rules.evaluate(context);
        if (result.isSuccess()) {
            
        }
        return null;
    }

    public abstract RuleBase buildRules();

    public abstract void execute(final FlowContextSpec context);

}
