package com.example.controle.adapters.network;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class TransactionRequest {
    private final BigDecimal value;
    private final String type;
}
