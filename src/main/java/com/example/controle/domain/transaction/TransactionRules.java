package com.example.controle.domain.transaction;


import com.example.controle.domain.rules.RuleBase;
import com.example.controle.domain.transaction.rules.RuleTest;
import com.example.controle.domain.transaction.rules.RuleTestOther;
import com.example.controle.domain.transaction.rules.ValueRule;

public class TransactionRules implements TransactionRulesSpec{

    @Override
    public RuleBase validateTest(){
        return RuleTest.builder().build();
    }

    @Override
    public RuleBase validateTestOther(){
        return RuleTestOther.builder().build();
    }

    @Override
    public RuleBase validateValue() {
        return ValueRule.builder().build();
    }

}
