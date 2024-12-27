package com.example.controle.domain.message;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class TransactionMessage extends BaseMessage {
	private final String value;
	private final String type;
	private final String accountId;
}
