package edu.hm.marketsm.hello_maven.dao;

import edu.hm.marketsm.hello_maven.dto.Product;

public interface ProductDAO {

	void create(Product product);
	
	void update(Product product);
	
	void delete(int id);
	
	Product read(int id);
}
