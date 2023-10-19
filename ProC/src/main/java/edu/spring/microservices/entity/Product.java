package edu.spring.microservices.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
//	@Column(unique=true)
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
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<Subscriptions> subscriptions;
	private List<String> subscriptions;
	private String addon;
	private String admin;
	private String status;
	
}
