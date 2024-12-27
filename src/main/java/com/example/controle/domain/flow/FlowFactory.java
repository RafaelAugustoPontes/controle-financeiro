package com.example.controle.domain.flow;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class FlowFactory {

    private final Map<String, FlowBase> flows = new HashMap<>();

    public void register(final String name, final FlowBase flow) {
        flows.put(name, flow);
    }

    public FlowBase get(final String name) {
        FlowBase flow = flows.get(name);
        if (flow == null) {
            throw new IllegalArgumentException("Flow not found: " + name);
        }
        return flow;
    }

    public void report() {
        log.info("** Flows carregados**");
        flows.keySet().forEach(key -> log.info(key));
    }

}
