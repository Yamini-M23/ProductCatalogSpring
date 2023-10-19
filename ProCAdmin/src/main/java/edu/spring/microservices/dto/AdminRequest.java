package edu.spring.microservices.dto;



import java.util.Date;

import edu.spring.microservices.entity.Admin;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
	
public class AdminRequest {
	
	private String adminName;
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
