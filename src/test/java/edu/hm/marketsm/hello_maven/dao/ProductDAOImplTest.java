package edu.hm.marketsm.hello_maven.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.hm.marketsm.hello_maven.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateAProduct() {
		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("Samsung Galaxy S7");
		product.setPrice(699);
		product.setDescription("Hamma");
		dao.create(product);
		
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("Samsung Galaxy S7", result.getName());
	}

}
