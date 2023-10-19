package edu.spring.microservices.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.spring.microservices.dto.ProductRequest;
import edu.spring.microservices.dto.ProductResponse;
import edu.spring.microservices.entity.Product;
import edu.spring.microservices.repository.ProductRepository;
import edu.spring.microservices.service.ProductService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor

@RequestMapping("/add")
@CrossOrigin(originPatterns = "http://localhost:4200")
public class ProductController {
	
	private final ProductService productService;
	
	private final ProductRepository productRepository;
	
	
	@PostMapping("/addplans")
//	public void addProduct(@RequestBody ProductRequest productRequest)
	public String addProduct(@RequestBody Product product)
	{
		System.out.println(product);
		productService.addNewProduct(product);
		return "Product Added Successfully";
	}
	
	
	@GetMapping("/getplans/{category}")
	public List<Product> getAllProducts(@PathVariable String category)
	{
		System.out.println(category);
		System.out.println(productService.getProducts(category));
		return productService.getProducts(category);
	}
	

//	@GetMapping("/getplans")
//	public List<Product> getAllProducts()
//	{
//		return productService.getProducts();
//	}
	
	@PostMapping("/editwirelineproducts")
	public String editWirelineProducts(@RequestBody Product product)
	{
		productRepository.save(product);
		return "Product Edited Successfully";
	}
	
	@PostMapping("/deletewirelineproducts")
	public String deleteWirelineProducts(@RequestBody Product product)
	{
		productRepository.delete(product);
		return "Product Deleted Successfully";
	}
	
	@PostMapping("/editproducts")
	public String editWirelessProducts(@RequestBody Product product)
	{
		productRepository.save(product);
		return "Product Edited Successfully";
	}
	
	@PostMapping("/deleteproducts")
	public String deleteWirelessProducts(@RequestBody Product product)
	{
		productRepository.delete(product);
		return "Product Deleted Successfully";
	}
	

}
