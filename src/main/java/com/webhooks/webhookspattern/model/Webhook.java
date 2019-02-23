package com.webhooks.webhookspattern.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Webhook {
	
	public Webhook() {
		this.webhookKey = UUID.randomUUID().toString();
	}
	
	@Id
	@Column(name="webhookKey")
	private String webhookKey;
	@Column(name="eventName")
	private String eventName;
	@Column(name="eventVersion")
	private String eventVersion;
	@Column(name="product")
	private String product;
	@Column(name="uniqueProductIdentifier")
	private Long UPI;
	@Column(name="appKey")
	private String developerAppKey;
	@Column(name="secretKeys")
	private String secretKeys;
	@Column(name="callbackUrl")
	private String callbackUrl;
}
