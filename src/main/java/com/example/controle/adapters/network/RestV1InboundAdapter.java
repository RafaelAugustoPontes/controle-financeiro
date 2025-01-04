package com.example.controle.adapters.network;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.controle.domain.ServiceExecutor;
import com.example.controle.domain.message.MessageHeader;
import com.example.controle.domain.message.SystemMessage;
import com.example.controle.domain.message.TransactionMessage;
import com.example.controle.domain.transaction.TransactionFlow;
import com.example.controle.ports.inbound.SystemEntrypoint;

@RestController
@RequestMapping("/v1")
public class RestV1InboundAdapter {

    private final ServiceExecutor serviceExecutor;

    public RestV1InboundAdapter(ServiceExecutor serviceExecutor) {
        this.serviceExecutor = serviceExecutor;
    }

    @PostMapping("/transactions")
    public ResponseEntity<Object> insertTransaction(final TransactionRequest request) {
        serviceExecutor.execute(SystemMessage.builder()
                .message(TransactionMessage.builder()
                        .value(request.getValue())
                        .type(request.getType())
                        .build())
                .header(MessageHeader.builder().flowId(TransactionFlow.NAME).user("system").build())
                .build());
        // TODO criar response
        return ResponseEntity.ok().build();
    }

}
