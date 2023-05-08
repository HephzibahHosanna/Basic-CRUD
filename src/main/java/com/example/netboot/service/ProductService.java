package com.example.netboot.service;


import java.util.List;

import com.example.netboot.model.Product;

public interface ProductService {
	
	Product createProduct(Product product);

	Product updateProduct(Product product);

	List<Product> getAllProduct();

	Product getProductById(long productId);

	void deleteProduct(long id);
}