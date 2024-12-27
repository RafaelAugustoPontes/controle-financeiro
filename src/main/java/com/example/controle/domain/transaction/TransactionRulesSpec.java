package com.example.controle.domain.transaction;

import com.example.controle.domain.rules.RuleBase;

public interface TransactionRulesSpec {

    RuleBase validateTest();
    RuleBase validateTestOther();
    RuleBase validateValue();

}
