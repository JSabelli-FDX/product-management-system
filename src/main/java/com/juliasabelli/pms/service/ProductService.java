package com.juliasabelli.pms.service;

import java.util.List;

import com.juliasabelli.pms.entity.Product;

/**
 * The ProductService interface provides methods to perform CRUD operations on the 'products' table in the database.
 * The methods defined in this interface are implemented in the ProductServiceImpl class.
 */
public interface ProductService {

	/**
	 * This method retrieves all products from the database.
	 * It is implemented in the ProductServiceImpl class.
	 */
	List<Product> getAllProducts();

	/**
	 * This method saves a product to the database.
	 * It is implemented in the ProductServiceImpl class.
	 */
	Product saveProduct(Product product);

	/**
	 * This method retrieves a product by its ID from the database.
	 * It is implemented in the ProductServiceImpl class.
	 */
	Product getProductById(Long id);

	/**
	 * This method updates a product in the database.
	 * It is implemented in the ProductServiceImpl class.
	 */
	Product updateProduct(Product product);

	/**
	 * This method deletes a product by its ID from the database.
	 * It is implemented in the ProductServiceImpl class.
	 */
	void deleteProductById(Long id);
}
