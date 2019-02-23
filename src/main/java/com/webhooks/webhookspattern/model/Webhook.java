package com.webhooks.webhookspattern.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


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
	
	@Id
	@Column(name="webhookKey")
	@GeneratedValue
	private Long webhookKey;
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
	@Column(name="callbackUrl")
	private String callbackUrl;
}
