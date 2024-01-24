package com.juliasabelli.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.juliasabelli.pms.entity.Product;

/**
 * The ProductRepository interface extends JpaRepository interface provided by Spring Data JPA.
 * It provides methods to perform CRUD operations on the 'products' table in the database.
 * The JpaRepository interface requires two parameters, the type of the entity and the type of the primary key of the entity.
 * In this case, the entity is Product and the type of the primary key is Long.
 */
public interface ProductRepository extends JpaRepository<Product, Long>{

}