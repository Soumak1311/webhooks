package com.webhooks.webhookspattern.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webhooks.webhookspattern.data.WebhookRequest;
import com.webhooks.webhookspattern.data.WebhookResponse;
import com.webhooks.webhookspattern.mappers.WebhookResponseMapper;
import com.webhooks.webhookspattern.model.SecretKey;
import com.webhooks.webhookspattern.model.Webhook;
import com.webhooks.webhookspattern.repo.WebhooksRepository;

@Service
public class WebhooksServiceImpl implements WebhooksService{
	
	@Autowired
	private WebhooksRepository webhookRepo;
	
	@Override
	public List<WebhookResponse> createWebhooks(List<WebhookRequest> w_reqs, String developerAppKey){
		List<WebhookResponse> webhookResponse = new ArrayList<>();
		SecretKey secretKey = SecretKey.builder().build();
		for(WebhookRequest webhookReq: w_reqs) {
			Webhook webhook = Webhook.builder()
					.callbackUrl(webhookReq.getCallbackUrl())
					.developerAppKey(developerAppKey)
					.eventName(webhookReq.getEventName())
					.eventVersion(webhookReq.getEventVersion())
					.product(webhookReq.getProduct())
					.UPI(webhookReq.getUPI())
					.build();
			webhookRepo.save(webhook);
			webhookResponse.add(WebhookResponseMapper.MAPPER.toWebhookResponse(webhook));
		}
		return webhookResponse;
	}
}
