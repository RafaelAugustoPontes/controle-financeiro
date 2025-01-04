package com.example.controle.ports.inbound;

import com.example.controle.domain.message.SystemMessage;
import com.example.controle.domain.message.SystemResponse;

public interface SystemEntrypoint {
    SystemResponse execute(final SystemMessage systemMessage);
}
