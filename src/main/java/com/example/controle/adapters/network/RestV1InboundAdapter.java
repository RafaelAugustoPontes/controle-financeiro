package com.example.controle.adapters.network;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.controle.domain.ServiceExecutor;
import com.example.controle.ports.inbound.HttpPort;

@RestController
@RequestMapping("/v1")
public class RestV1InboundAdapter implements HttpPort {

    private final ServiceExecutor serviceExecutor;

    public RestV1InboundAdapter(ServiceExecutor serviceExecutor) {
        this.serviceExecutor = serviceExecutor;
    }

    @PostMapping("/transactions")
    public ResponseEntity<Object> insertTransaction(Object some){
        // TODO criar request e response
        return ResponseEntity.ok().build();
    }

}
