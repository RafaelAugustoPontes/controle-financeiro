package com.example.controle.domain.transaction;

import com.example.controle.domain.flow.RuleBase;

public interface TransactionRulesSpec {

    RuleBase validateTest();
    RuleBase validateTestOther();

}
