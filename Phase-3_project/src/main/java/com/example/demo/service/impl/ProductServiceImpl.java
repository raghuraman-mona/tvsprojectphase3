package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Shoe;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;
	
	@Override
	public Shoe addProduct(Shoe shoe) {
		
		return repository.save(shoe);
	}

	@Override
	public Shoe updateProduct(Shoe shoe) {
		return repository.save(shoe);
	}

	@Override
	public Shoe getProductById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public void deleteProductById(int id) {
		repository.deleteById(id);
	}

	@Override
	public List<Shoe> getAllProducts() {
		return repository.findAll();
	}

	@Override
	public List<Shoe> getProductsByShoeBrandName(String ShoeBrandName) {
		
		return repository.findByShoeBrandName(ShoeBrandName);
	}

}
