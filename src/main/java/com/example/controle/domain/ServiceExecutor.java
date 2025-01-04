package com.example.controle.domain;

import org.springframework.stereotype.Service;

import com.example.controle.domain.flow.FlowResult;
import com.example.controle.domain.message.SystemMessage;


@Service
public class ServiceExecutor {

    private final CoreEntrypoint entrypoint;

    public ServiceExecutor(CoreEntrypoint entrypoint) {
        this.entrypoint = entrypoint;
    }

    public FlowResult execute(final SystemMessage systemMessage) {
        entrypoint.execute(systemMessage);
        return null;
    }

    public void init() {
        entrypoint.init();
    }

    public void report() {
        entrypoint.report();
    }

}
