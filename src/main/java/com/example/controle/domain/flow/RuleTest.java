package com.example.controle.domain.flow;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

@Builder
@Slf4j
public class RuleTest extends RuleBase {

    @Override
    public RuleResult evaluate(RuleContextSpec context) {
        System.out.println("RuleTest.evaluate");
        return RuleResult.success();
    }

}
