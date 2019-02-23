package com.webhooks.webhookspattern.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class WebhookDTO {
	
	private String webhookKey;
	private String eventName;
	private String eventVersion;
	private String product;
	private String callbackUrl;
}
