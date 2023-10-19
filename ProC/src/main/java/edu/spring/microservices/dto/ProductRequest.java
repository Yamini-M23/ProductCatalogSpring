package edu.spring.microservices.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
	
public class ProductRequest {
	
	private String plan;
	private String category;
	private String productcategory;
	private String productsubcategory;
	private String validity;
	private String billcycle;
	private String data;
	private String dataperday;
	private String voice;
	private String sms;
	private List<String> subscriptions;
	private String addon;
	private String admin;
	private String status;
	

}
