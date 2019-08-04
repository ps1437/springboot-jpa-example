package com.syscho.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syscho.boot.dao.ProductDao;
import com.syscho.boot.vo.Product;

/**
 * @author Soni
 *
 */
@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;

	public List<Product> getProducts() {

		return productDao.findAll();
	}

	public Product getProductById(Long prodId) {

		return productDao.findProductByProductId(prodId);
	}

	public List<Product> getProductsByName(String prodName) {

		return productDao.findAllByProductName(prodName);
	}

	public int deleteProdById(long prodId) {

		return productDao.deleteByProductId(prodId);
	}

	public Product saveProduct(Product product) {
		Product save = productDao.save(product);

		return save;
	}

	public Product updateProduct(Product product) {
		return productDao.save(product);
	}

}
