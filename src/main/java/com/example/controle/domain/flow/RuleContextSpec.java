package com.example.controle.domain.flow;

import com.example.controle.ports.outbond.DatabasePort;


public interface RuleContextSpec {

    DatabasePort getDatabasePort();

}
