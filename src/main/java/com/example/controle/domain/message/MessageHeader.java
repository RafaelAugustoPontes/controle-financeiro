package com.example.controle.domain.message;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MessageHeader {

    private final String user;
    private final String flowId;



}
