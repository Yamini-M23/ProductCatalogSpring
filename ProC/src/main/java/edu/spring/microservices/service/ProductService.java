package edu.spring.microservices.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import edu.spring.microservices.dto.ProductRequest;
import edu.spring.microservices.dto.ProductResponse;
import edu.spring.microservices.entity.Product;
import edu.spring.microservices.repository.ProductRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
	
	private final ProductRepository productRepository;
	
//	public void addNewProduct(ProductRequest productRequest)
	public void addNewProduct(Product product)
	{
//		Product product = Product.builder()
//				.productName(productRequest.getProductName())
//				.productPrice(productRequest.getProductPrice())
//				.productQuantity(productRequest.getProductQuantity())
//				.build();
		 productRepository.save(product);
	}
	
//	public List<ProductResponse> getProducts()
	
//	public List<Product> getProducts(String category)
//	{
//		List<Product> products = productRepository.findAll();
//		List<ProductResponse> responseProduct = new ArrayList<>();
//		for(Product p : products)
//		{
//			responseProduct.add(mapToProductResponse(p));
//		}
//		return responseProduct;
		public List<Product> getProducts(String productCategory)
		{
//		return productRepository.findAll();
		return productRepository.findByProductcategory(productCategory);
	}

}
