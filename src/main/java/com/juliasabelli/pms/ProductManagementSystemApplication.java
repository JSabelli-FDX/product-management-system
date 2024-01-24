package com.juliasabelli.pms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.juliasabelli.pms.entity.Product;
import com.juliasabelli.pms.repository.ProductRepository;

/**
 * The ProductManagementSystemApplication class is the entry point of the Spring Boot application.
 * It implements the CommandLineRunner interface which indicates that a bean should run when it is contained within a SpringApplication.
 * The run method is invoked with the command line arguments, after the application context is loaded and right before the SpringApplication.run(…) method completes.
 * The ProductRepository is autowired, which means Spring will handle the lifecycle of the ProductRepository object.
 */
@SpringBootApplication
public class ProductManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProductManagementSystemApplication.class, args);
	}

	@Autowired
	private ProductRepository productRepository;

	/**
	 * The run method is invoked with the command line arguments, after the application context is loaded and right before the SpringApplication.run(…) method completes.
	 */
	@Override
	public void run(String... args) throws Exception {

	}

}