package com.example.controle.domain.flow;

import com.example.controle.domain.message.BaseMessage;
import com.example.controle.ports.outbond.DatabasePort;

public class FlowContext implements FlowContextSpec {

    private final DatabasePort databasePort;
    private final BaseMessage message;

    public FlowContext(DatabasePort databasePort, BaseMessage message) {
        this.databasePort = databasePort;
        this.message = message;
    }

    @Override
    public DatabasePort getDatabasePort() {
        return databasePort;
    }

    @Override
    public BaseMessage getMessage() {
        return message;
    }

}
