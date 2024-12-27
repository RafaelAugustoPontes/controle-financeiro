package com.example.controle.domain.flow;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

@Builder
@Slf4j
public class RuleTestOther extends RuleBase {

    @Override
    public RuleResult evaluate(RuleContextSpec context) {
        System.out.println("RuleTestOther.evaluate");
        return RuleResult.success();
    }

}
