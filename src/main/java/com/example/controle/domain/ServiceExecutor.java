package com.example.controle.domain;

import org.springframework.stereotype.Service;


@Service
public class ServiceExecutor {

    private final CoreEntrypoint entrypoint;

    public ServiceExecutor(CoreEntrypoint entrypoint) {
        this.entrypoint = entrypoint;
    }

    public void init() {
        entrypoint.init();
    }

    public void report() {
        entrypoint.report();
    }

}
