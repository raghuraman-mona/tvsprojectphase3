package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Shoe;

public interface ProductService {

	public Shoe addProduct(Shoe product);
	public Shoe updateProduct(Shoe product);
	public Shoe getProductById(int id);
	public void deleteProductById(int id);
	public List<Shoe> getAllProducts();
	public List<Shoe> getProductsByShoeBrandName(String ShoeBrandName);
}
