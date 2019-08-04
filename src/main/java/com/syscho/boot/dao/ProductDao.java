package com.syscho.boot.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.syscho.boot.vo.Product;

@Repository
public interface ProductDao extends CrudRepository<Product, Long> {
	public List<Product> findAll();

	public Product findProductByProductId(Long prodId);

	public List<Product> findAllByProductName(String prodName);

	public int deleteByProductId(long prodId);

}
