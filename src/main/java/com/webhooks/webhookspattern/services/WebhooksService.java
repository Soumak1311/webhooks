package com.webhooks.webhookspattern.services;

import java.util.List;

import com.webhooks.webhookspattern.data.WebhookRequest;
import com.webhooks.webhookspattern.data.WebhookResponse;

public interface WebhooksService {
	public List<WebhookResponse> createWebhooks(List<WebhookRequest> webhookReqs, String developerAppKey);
}
