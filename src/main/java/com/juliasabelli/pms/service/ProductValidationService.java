package com.juliasabelli.pms.service;

import com.juliasabelli.pms.entity.Product;
import org.springframework.stereotype.Service;

/**
 * The ProductValidationService class provides a method to validate a Product object.
 * It checks if the name and description of the product are not null and not empty, and if the price is greater than 0.
 */
@Service
public class ProductValidationService {

    /**
     * This method checks if a product is valid.
     * A product is considered valid if its name and description are not null and not empty, and its price is greater than 0.
     */
    public boolean isValidProduct(Product product) {
        return product.getName() != null && !product.getName().isEmpty() &&
                product.getDescription() != null && !product.getDescription().isEmpty()  && product.getPrice() > 0;
    }
}