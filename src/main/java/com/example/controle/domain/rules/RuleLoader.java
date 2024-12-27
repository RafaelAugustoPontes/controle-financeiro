package com.example.controle.domain.rules;

import com.example.controle.domain.flow.FlowContextSpec;

class RuleLoader extends RuleBase {

    @Override
    public RuleResult evaluate(FlowContextSpec context) {
        return RuleResult.success();
    }

}
