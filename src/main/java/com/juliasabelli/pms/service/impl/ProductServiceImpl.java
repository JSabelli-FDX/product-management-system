package com.juliasabelli.pms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juliasabelli.pms.entity.Product;
import com.juliasabelli.pms.repository.ProductRepository;
import com.juliasabelli.pms.service.ProductService;

/**
 * The ProductServiceImpl class implements the ProductService interface.
 * It provides methods to perform CRUD operations on the 'products' table in the database.
 * It uses the ProductRepository to interact with the database.
 */
@Service
public class ProductServiceImpl implements ProductService{

	private ProductRepository productRepository;

	/**
	 * The constructor takes a ProductRepository and assigns it to the corresponding instance variable.
	 */
	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	/**
	 * This method retrieves all products from the database using the ProductRepository.
	 */
	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	/**
	 * This method saves a product to the database using the ProductRepository.
	 */
	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	/**
	 * This method retrieves a product by its ID from the database using the ProductRepository.
	 */
	@Override
	public Product getProductById(Long id) {
		return productRepository.findById(id).get();
	}

	/**
	 * This method updates a product in the database using the ProductRepository.
	 */
	@Override
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}

	/**
	 * This method deletes a product by its ID from the database using the ProductRepository.
	 */
	@Override
	public void deleteProductById(Long id) {
		productRepository.deleteById(id);
	}

}