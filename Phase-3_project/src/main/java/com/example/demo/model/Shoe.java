package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;

@Entity
@Table
//@NoArgsConstructor
//@Setter
//@Getter
//@EqualsAndHashCode()
//@ToString
public class Shoe {

	@Id
	@GeneratedValue
	private int id;
	private String shoeName;
	private double shoeprice;
	private float rating;
	private String shoeBrandName;
	
	
	public Shoe() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", shoeName=" + shoeName + ", shoeprice=" + shoeprice + ", rating=" + rating
				+ ", ShoeBrandName=" + shoeBrandName + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShoeName() {
		return shoeName;
	}
	public void setShoeName(String shoeName) {
		this.shoeName = shoeName;
	}
	public double getShoeprice() {
		return shoeprice;
	}
	public void setShoeprice(double shoeprice) {
		this.shoeprice = shoeprice;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getShoeBrandName() {
		return shoeBrandName;
	}
	public void setShoeBrandName(String shoeBrandName) {
		this.shoeBrandName = shoeBrandName;
	}
	

	
}
