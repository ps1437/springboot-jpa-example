package com.syscho.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.syscho.boot.service.ProductService;
import com.syscho.boot.vo.Product;

@SpringBootApplication
public class SpringbootApplication extends SpringBootServletInitializer implements CommandLineRunner {

	@Autowired
	private ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		for (int i=0;i<5;i++) {
			productService.saveProduct(new Product("SHOES",200*i,"NIKE"));
		}

	}
}
