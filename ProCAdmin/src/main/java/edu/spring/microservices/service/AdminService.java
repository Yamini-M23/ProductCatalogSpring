package edu.spring.microservices.service;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import edu.spring.microservices.dto.AdminRequest;
import edu.spring.microservices.entity.Admin;
import edu.spring.microservices.entity.AdminCredentials;
import edu.spring.microservices.repository.AdminRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminService {
	
	private final AdminRepository adminRepository;
	
	public String createAdmin(AdminRequest adminRequest)
	{
		Admin admin=new Admin();
		admin.setAdminName(adminRequest.getAdminName());
		admin.setEmail(adminRequest.getEmail());
		admin.setPassword(adminRequest.getPassword());
		admin.setPhone(adminRequest.getPhone());
		admin.setDob(adminRequest.getDob());
		admin.setGender(adminRequest.getGender());
		admin.setAddress(adminRequest.getAddress());
		admin.setState(adminRequest.getState());
		admin.setDistrict(adminRequest.getDistrict());
		admin.setLinkedin(adminRequest.getLinkedin());
		admin.setFacebook(adminRequest.getFacebook());
		admin.setInstagram(adminRequest.getInstagram());
		admin.setStatus(adminRequest.getStatus());
		adminRepository.save(admin);
		return null;
		
	}
	
   public ResponseEntity<AdminCredentials> ValidateUser(String email, String password) {

	    Admin admin = adminRepository.findByEmail(email);

	    System.out.println(admin.getEmail()+" "+admin.getPassword());

	    if (admin != null && admin.getPassword() != null && admin.getPassword().equals(password)) {

	        AdminCredentials response = new  AdminCredentials("success", admin);
 System.out.println("success");
	        return ResponseEntity.ok(response);

	    } 
	    
	    else 
	    {

	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new AdminCredentials("failed", null));

	    }

	}

}
