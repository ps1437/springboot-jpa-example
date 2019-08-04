package com.syscho.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syscho.boot.service.ProductService;
import com.syscho.boot.vo.Product;

/**
 * @author Soni
 *
 */
@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/save")
	public Product saveProduct(Product product) {
		return productService.saveProduct(product);
	}

	@RequestMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}

	@RequestMapping("/delete/{id}")
	public int deleteProdById(@PathVariable("id") long prodId) {
		return productService.deleteProdById(prodId);
	}

	@RequestMapping("/view/search/id/{id}")
	public Product getProductById(@PathVariable("id") long prodId) {
		return productService.getProductById(prodId);
	}

	@RequestMapping("/view/search/name/{name}")
	public List<Product> getProductsByName(@PathVariable("name") String prodName) {
		return productService.getProductsByName(prodName);
	}

	@RequestMapping("/view")
	public List<Product> getProducts() {
		return productService.getProducts();
	}

}
