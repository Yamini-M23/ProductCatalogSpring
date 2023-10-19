package edu.spring.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.spring.microservices.entity.Admin;
import edu.spring.microservices.entity.AdminCredentials;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

	Admin findByEmail(String email);
	

}
