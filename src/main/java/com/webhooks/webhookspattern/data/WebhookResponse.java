package com.webhooks.webhookspattern.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class WebhookResponse extends WebhookDTO {
	private SecretKeyDTO secretKey;
}
