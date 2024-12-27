package com.example.controle.domain.flow;

import com.example.controle.domain.message.BaseMessage;
import com.example.controle.ports.outbond.DatabasePort;


public interface FlowContextSpec {

    DatabasePort getDatabasePort();
    BaseMessage getMessage();

}
