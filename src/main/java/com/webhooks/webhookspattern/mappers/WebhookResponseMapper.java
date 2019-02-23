package com.webhooks.webhookspattern.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.webhooks.webhookspattern.data.WebhookResponse;
import com.webhooks.webhookspattern.model.Webhook;


@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface WebhookResponseMapper {
    WebhookResponseMapper MAPPER = Mappers.getMapper(WebhookResponseMapper.class);

    WebhookResponse toWebhookResponse(Webhook webhook);
}