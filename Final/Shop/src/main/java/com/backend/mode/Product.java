package com.backend.mode;

import java.beans.Transient;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component

public class Product {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String description;
	private int price;
	@OneToOne
	@JoinColumn(name="categoryId")
	private Category category;
	@OneToOne
	@JoinColumn(name="supplierId")
	private Supplier supplier;
	/*@Transient
	private MultipartFile image;
	
	public MultipartFile getImage()
	{
		return image;
	}
	public void setImage(MultipartFile image)
	{
		this.image = image;
		
	}*/
	
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
