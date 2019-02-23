package com.webhooks.webhookspattern.model;

import java.util.UUID;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SecretKey {
	
	public SecretKey() {
		this.value = UUID.randomUUID().toString();
		this.id = 0L;
	}
	
	private Long id;
	private String value;
}
