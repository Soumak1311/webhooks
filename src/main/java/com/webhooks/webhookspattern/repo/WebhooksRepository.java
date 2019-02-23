package com.webhooks.webhookspattern.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webhooks.webhookspattern.model.Webhook;

@Repository
public interface WebhooksRepository extends CrudRepository<Webhook, Long> {
	
}
