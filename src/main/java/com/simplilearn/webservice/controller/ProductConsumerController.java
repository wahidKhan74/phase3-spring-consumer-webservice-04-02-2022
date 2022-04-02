package com.simplilearn.webservice.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.simplilearn.webservice.model.Product;

@RestController
@RequestMapping("/api/consumer")
public class ProductConsumerController {

	String apiUrl = "http://localhost:8090/product";
	
	@GetMapping("/products")
	public List<Product> fetchAllProducts() {
		// use rest template
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<List> response = restTemplate.getForEntity(apiUrl+"s", List.class);
		return response.getBody();
	}
	
	
	@GetMapping("/products/{id}")
	public Product fetchOneProducts(@PathVariable(name="id") long id) {
		// use rest template
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<Product> response = restTemplate.getForEntity(apiUrl+"/"+id, Product.class);
		return response.getBody();
	}
	
	@PutMapping("/products")
	public String updateOneProduct(@RequestBody Product product) {
		// use rest template
		RestTemplate restTemplate = new RestTemplate();
		
		restTemplate.put(apiUrl+"s", product);
		return "Product is updated successfully";
	}
	
	
	@DeleteMapping("/products/{id}")
	public String deleteProduct(@PathVariable("id") long id) {
		// use rest template
		RestTemplate restTemplate = new RestTemplate();
		
		// consume url endpoint
		restTemplate.delete(apiUrl+"s/"+id);
		return "Product is deleted sucessfully !";
	}
}
