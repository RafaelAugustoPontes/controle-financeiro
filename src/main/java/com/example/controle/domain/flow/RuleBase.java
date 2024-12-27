package com.example.controle.domain.flow;

public abstract class RuleBase {

    protected RuleBase next;

    abstract RuleResult evaluate(RuleContextSpec context);

    public RuleResult execute(RuleContextSpec context) {
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

}
