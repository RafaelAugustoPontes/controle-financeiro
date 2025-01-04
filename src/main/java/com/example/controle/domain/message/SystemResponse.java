package com.example.controle.domain.message;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SystemResponse<T> {

    private T object;
    private boolean sucess;
    private boolean businessError;
    private boolean aplicationError;
    private boolean empty;
    private String message;

    public static SystemResponse<?> ofException() {
        return SystemResponse.builder().empty(true).aplicationError(true).build();
    }

    
    public static SystemResponse<?> ofBusinessError(final String message) {
        return SystemResponse.builder().message(message).aplicationError(true).build();
    }

    public static SystemResponse<?> ofSuccess(final String object) {
        return SystemResponse.builder().object(object).sucess(true).build();
    }

}
