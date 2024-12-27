package com.example.controle.domain.transaction.rules;

import java.math.BigDecimal;

import com.example.controle.domain.flow.FlowContextSpec;
import com.example.controle.domain.message.TransactionMessage;
import com.example.controle.domain.rules.RuleBase;
import com.example.controle.domain.rules.RuleResult;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

@Builder
@Slf4j
public class ValueRule extends RuleBase {

    @Override
    public RuleResult evaluate(FlowContextSpec context) {
        final TransactionMessage message = (TransactionMessage) context.getMessage();

        if (message.getValue().compareTo(BigDecimal.ZERO) <= 0) {
            return RuleResult.failure("Value must be greater than zero");
        }

        return RuleResult.success();
    }

}
