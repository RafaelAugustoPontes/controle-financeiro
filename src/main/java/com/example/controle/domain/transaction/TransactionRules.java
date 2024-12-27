package com.example.controle.domain.transaction;


import com.example.controle.domain.flow.RuleBase;
import com.example.controle.domain.flow.RuleTest;
import com.example.controle.domain.flow.RuleTestOther;

public class TransactionRules implements TransactionRulesSpec{

    @Override
    public RuleBase validateTest(){
        return RuleTest.builder().build();
    }

    @Override
    public RuleBase validateTestOther(){
        return RuleTestOther.builder().build();
    }

}
