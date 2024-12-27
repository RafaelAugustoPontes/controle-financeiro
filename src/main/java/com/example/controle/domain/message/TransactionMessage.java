package com.example.controle.domain.message;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class TransactionMessage extends BaseMessage {
	private final Integer accountId;
	private final BigDecimal value;
	private final String type;
}
