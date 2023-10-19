package edu.spring.microservices.entity;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer adminId;
	private String adminName;
	@Column(unique=true)
	private String email;
	private String password;
	private String phone;
	private Date dob;
	private String gender;
	private String address;
	private String state;
	private String district;
	private String linkedin;
	private String facebook;
	private String instagram;
	private String status;


}
