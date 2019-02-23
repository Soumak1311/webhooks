package com.webhooks.webhookspattern.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.webhooks.webhookspattern.constants.APIConstants.WEBHOOKS_PATH;
import com.webhooks.webhookspattern.data.WebhookRequest;
import com.webhooks.webhookspattern.data.WebhookResponse;
import com.webhooks.webhookspattern.services.WebhooksService;

@RestController
public class WebhooksController {
	
	@Autowired
	WebhooksService webhooksService;
	
	@RequestMapping(method = RequestMethod.POST, path = WEBHOOKS_PATH)
	public List<WebhookResponse> createWebhooks(@RequestBody List<WebhookRequest> webhooks, HttpServletRequest request){
		String developerAppKey = getDeveloperAppKey(request);
		return webhooksService.createWebhooks(webhooks, developerAppKey);
	}
	
	public String getDeveloperAppKey(HttpServletRequest request) {
		return request.getHeader("developerAppKey");
	}
}
