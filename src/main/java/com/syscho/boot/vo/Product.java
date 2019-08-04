package com.syscho.boot.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Soni
 *
 */
@Entity
@Table(name="PRODUCT")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7609287080733854040L;
	@Id
    @GeneratedValue
	@Column(name = "PRODUCT_ID")
	private Long productId;
	@Column(name = "PRODUCT_NAME")

	private String productName;
	@Column(name = "PRODUCT_PRICE")
	private int productPrice;
	@Column(name = "PRODUCT_DESC")
	private String productDesc;

	public Product(String productName, int productPrice, String productDesc) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDesc = productDesc;
	}

	public Product() {
		super();
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

}
