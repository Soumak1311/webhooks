package com.webhooks.webhookspattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.webhooks.webhookspattern.repo")
public class WebhooksPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebhooksPatternApplication.class, args);
	}

}
