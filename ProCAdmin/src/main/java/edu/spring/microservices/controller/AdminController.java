package edu.spring.microservices.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.spring.microservices.dto.AdminRequest;
import edu.spring.microservices.entity.Admin;
import edu.spring.microservices.entity.AdminCredentials;
import edu.spring.microservices.repository.AdminRepository;
import edu.spring.microservices.service.AdminService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin")
@CrossOrigin(originPatterns = "http://localhost:4200")
public class AdminController {
	
	private final AdminService adminService;
	
	private final AdminRepository adminRepository;
	
	@GetMapping("/getadmins")
	public List<Admin> getAdmins()
	{
		return adminRepository.findAll();
	}
	
	
	@PostMapping("/postadmins")
//	@ResponseBody
	public String addAdmin(@RequestBody AdminRequest adminRequest)
	{
		System.out.println(adminRequest);
		return adminService.createAdmin(adminRequest);
	}
	
	@PostMapping("/approveadmins")
	public String approveAdmin(@RequestBody Admin admin)
	{
	  adminRepository.save(admin);
		return "Admin Approved";
	}
	
	@PostMapping("/credentialsValidate")
	public ResponseEntity<AdminCredentials> getAdminCredentials(@RequestBody Map<String,String> credentials)
	{
		String email = credentials.get("email");
	    String password = credentials.get("password");
	    System.out.println(email);
	    return adminService.ValidateUser(email, password);

		

		

	}

}
