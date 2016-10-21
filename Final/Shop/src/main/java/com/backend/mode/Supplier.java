package com.backend.mode;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table
@Component
public class Supplier {
	@Id
	@Column(name="supplierId")
	 @GeneratedValue(strategy=GenerationType.AUTO)
	private int supplierId;
	@Column(name="supplierName")
	private String supplierName;
	private String type;
	private String address;
	
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}


	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	


}
