package com.example.controle.domain.transaction.rules;

import com.example.controle.domain.flow.FlowContextSpec;
import com.example.controle.domain.rules.RuleBase;
import com.example.controle.domain.rules.RuleResult;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

@Builder
@Slf4j
public class RuleTestOther extends RuleBase {

    @Override
    public RuleResult evaluate(FlowContextSpec context) {
        return RuleResult.success();
    }

}
