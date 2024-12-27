package com.example.controle.domain.flow;

import com.example.controle.domain.rules.RuleBase;
import com.example.controle.domain.rules.RuleResult;

public abstract class FlowBase {

    public FlowResult executeDefault(final FlowContextSpec context) {
       execute(context);
       return null;
    }

    public RuleResult validate(final FlowContextSpec context) {
        RuleResult evaluate = buildRules().execute(context);
        
        return evaluate;
    }

    public abstract RuleBase buildRules();

    public abstract void execute(final FlowContextSpec context);

}
