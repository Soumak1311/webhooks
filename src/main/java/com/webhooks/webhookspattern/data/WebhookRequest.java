package com.webhooks.webhookspattern.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WebhookRequest {
	private String eventVersion;
	private String eventName;
	private String product;
	private Long UPI;
	private String callbackUrl;
}
