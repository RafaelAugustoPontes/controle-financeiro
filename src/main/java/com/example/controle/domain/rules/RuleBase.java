package com.example.controle.domain.rules;

import com.example.controle.domain.flow.FlowContextSpec;

public abstract class RuleBase {

    protected RuleBase next;

    public abstract RuleResult evaluate(FlowContextSpec context);

    public RuleResult execute(FlowContextSpec context) {
        RuleResult result = evaluate(context);
        if (result.isSuccess() && next != null) {
            result = next.execute(context);
            next = next.next;
        }
        return result;
    }

    public RuleBase next(RuleBase next) {
        this.next = next;
        return next;
    }

    public static RuleBase getLoader() {
        return new RuleLoader();
    }

}
