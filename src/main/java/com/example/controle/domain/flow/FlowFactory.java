package com.example.controle.domain.flow;

import java.util.HashMap;
import java.util.Map;

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

}
