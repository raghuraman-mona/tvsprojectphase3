package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Shoe;
import com.example.demo.service.ProductService;

@RestController
public class ProductController  {

	@Autowired
	private ProductService service;
	
	@PostMapping("/shoe")
	public Shoe addProduct(@RequestBody Shoe shoe) {
		// TODO Auto-generated method stub
		return service.addProduct(shoe);
	}

	@PutMapping("/shoe")
	public Shoe updateProduct(@RequestBody Shoe shoe) 
	{
		// TODO Auto-generated method stub
		return service.updateProduct(shoe);
	}

	@GetMapping("/shoe/{id}")
	public Shoe getProductById(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return service.getProductById(id);
	}

	@DeleteMapping("/shoe/{id}")
	public void deleteProductById(@PathVariable int id) {
		// TODO Auto-generated method stub
		service.deleteProductById(id);
	}

	@GetMapping("/shoes")
	public List<Shoe> getAllProducts() {
		// TODO Auto-generated method stub
		return service.getAllProducts();
	}

	@GetMapping("/shoes/{ShoeBrandName}")
	public List<Shoe> getProductsByManufacturerName(@PathVariable String ShoeBrandName) {
		// TODO Auto-generated method stub
		return service.getProductsByShoeBrandName(ShoeBrandName);
	}

}
