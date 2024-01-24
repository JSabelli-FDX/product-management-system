package com.juliasabelli.pms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.juliasabelli.pms.entity.Product;
import com.juliasabelli.pms.service.ProductService;
import com.juliasabelli.pms.service.ProductValidationService;

/**
 * The ProductController class is a Spring MVC controller that handles HTTP requests related to product management in the application.
 * It uses the ProductService and ProductValidationService to perform operations on Product entities and validate them.
 */
@Controller
public class ProductController {

	private ProductService productService;
	private ProductValidationService productValidationService;

	/**
	 * The constructor takes two parameters, ProductService and ProductValidationService, and assigns them to the corresponding instance variables.
	 */
	public ProductController(ProductService productService, ProductValidationService productValidationService) {
		super();
		this.productService = productService;
		this.productValidationService = productValidationService;
	}

	/**
	 * This method handles GET requests to /products. It retrieves all products from the ProductService and adds them to the model under the attribute name "products".
	 * It then returns the name of the view to be rendered, "products".
	 */
	@GetMapping("/products")
	public String listProducts(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "products";
	}

	/**
	 * This method handles GET requests to /products/new. It creates a new Product object and adds it to the model under the attribute name "product".
	 * It then returns the name of the view to be rendered, "create_product".
	 */
	@GetMapping("/products/new")
	public String createProductForm(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "create_product";
	}

	/**
	 * This method handles POST requests to /products. It validates the Product object using ProductValidationService.
	 * If the product is valid, it saves the product using ProductService and redirects to the product list view.
	 * If the product is not valid, it adds an error message to the model and returns the "create_product" view.
	 */
	@PostMapping("/products")
	public String saveProduct(@ModelAttribute("product") Product product, Model model) {
		if (productValidationService.isValidProduct(product)) {
			productService.saveProduct(product);
			return "redirect:/products";
		} else {
			model.addAttribute("errorMessage", "Invalid product data. Please check the inputs and try again.");
			return "create_product";
		}
	}

	/**
	 * This method handles GET requests to /products/edit/{id}. It retrieves the product with the given ID from ProductService and adds it to the model under the attribute name "product".
	 * It then returns the name of the view to be rendered, "edit_product".
	 */
	@GetMapping("/products/edit/{id}")
	public String editProductForm(@PathVariable Long id, Model model) {
		model.addAttribute("product", productService.getProductById(id));
		return "edit_product";
	}

	/**
	 * This method handles POST requests to /products/{id}. It retrieves the existing product with the given ID from ProductService and updates its fields with the values from the Product object.
	 * It then validates the updated product using ProductValidationService. If the product is valid, it updates the product using ProductService and redirects to the product list view.
	 * If the product is not valid, it adds an error message to the model and returns the "edit_product" view.
	 */
	@PostMapping("/products/{id}")
	public String updateProduct(@PathVariable Long id,
								@ModelAttribute("product") Product product, Model model) {

		Product existingProduct = productService.getProductById(id);
		existingProduct.setId(id);
		existingProduct.setName(product.getName());
		existingProduct.setDescription(product.getDescription());
		existingProduct.setPrice(product.getPrice());

		if (productValidationService.isValidProduct(existingProduct)) {
			productService.updateProduct(existingProduct);
			return "redirect:/products";
		} else {
			model.addAttribute("errorMessage", "Invalid product data. Please check the inputs and try again.");
			return "edit_product";
		}
	}

	/**
	 * This method handles GET requests to /products/{id}. It deletes the product with the given ID using ProductService and then redirects to the product list view.
	 */
	@GetMapping("/products/{id}")
	public String deleteProduct(@PathVariable Long id) {
		productService.deleteProductById(id);
		return "redirect:/products";
	}

}
