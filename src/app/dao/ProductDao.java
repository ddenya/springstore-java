package app.dao;

import java.util.List;

import app.model.Product;

public interface ProductDao {
	
	void addProduct(Product product);
	
	Product getProductById(String id);
	
	List<Product> getAllProducts();
	
	void deleteProduct(String id);

}
