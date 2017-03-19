package edu.hm.marketsm.hello_maven.dao;

import java.util.HashMap;
import java.util.Map;

import edu.hm.marketsm.hello_maven.dto.Product;

public class ProductDAOImpl implements ProductDAO {
	
	Map<Integer,Product> products = new HashMap<>();

	@Override
	public void create(Product product) {
		products.put(product.getId(), product);

	}

	@Override
	public void update(Product product) {

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Product read(int id) {
		return products.get(id);
	}

}
