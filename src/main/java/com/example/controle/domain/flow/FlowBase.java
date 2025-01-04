package com.example.controle.domain.flow;

import com.example.controle.domain.rules.RuleBase;
import com.example.controle.domain.rules.RuleResult;

public abstract class FlowBase {

    public void executeDefault(final FlowContextSpec context) {
       execute(context);
    }

    public RuleResult validate(final FlowContextSpec context) {
        RuleResult evaluate = buildRules().execute(context);
        
        return evaluate;
    }

    protected abstract RuleBase buildRules();

    protected abstract void execute(final FlowContextSpec context);

}
