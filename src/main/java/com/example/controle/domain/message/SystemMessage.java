package com.example.controle.domain.message;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SystemMessage {

    private final BaseMessage message;

}
