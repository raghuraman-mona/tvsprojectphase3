package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Shoe;

@Repository
public interface ProductRepository extends JpaRepository<Shoe, Integer>  {

	public List<Shoe> findByShoeBrandName(String ShoeBrandName);
}
