package com.juliasabelli.pms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * The Product class is a Java entity that represents the Product table in the database.
 * It uses Jakarta Persistence annotations to map the class to the products table in the MySQL database.
 */
@Entity
@Table(name = "products")
public class Product {

	/**
	 * The id field is the primary key of the table.
	 * The value of the id field is generated automatically by the database.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * The name field represents a column in the products table.
	 * It cannot be null.
	 */
	@Column(name = "name", nullable = false)
	private String name;

	/**
	 * The description field represents a column in the products table.
	 */
	@Column(name = "description")
	private String description;

	/**
	 * The price field represents a column in the products table.
	 * It cannot be null.
	 */
	@Column(name = "price", nullable = false)
	private double price;

	/**
	 * Default constructor required by JPA.
	 */
	public Product() {

	}

	/**
	 * Constructor to create a new Product object with the specified name, description, and price.
	 */
	public Product(String name, String description, double price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}

	/**
	 * Getter for id.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Setter for id.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Getter for name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for name.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter for description.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Setter for description.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Getter for price.
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Setter for price.
	 */
	public void setPrice(double price) {
		this.price = price;
	}

}
