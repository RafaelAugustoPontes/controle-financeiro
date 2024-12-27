package com.example.controle.domain.model;

import java.math.BigDecimal;

public record Transaction(Integer id, BigDecimal value, TransactionType type, Account account) {

}
