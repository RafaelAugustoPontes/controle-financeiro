package com.example.controle.domain.flow;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class FlowResult {

    private final boolean success;
    private final boolean error;
    private final boolean validationError;
    private String message;
    private Object data;
    
    public static FlowResult error(String message) {
        return FlowResult.builder().error(true).message(message).build();
    }

}
