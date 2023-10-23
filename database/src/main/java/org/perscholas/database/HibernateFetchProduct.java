package org.perscholas.database;

import org.perscholas.database.dao.ProductDAO;
import org.perscholas.database.entity.Product;

public class HibernateFetchProduct {
	public static void main(String[] args) {
		ProductDAO productDAO = new ProductDAO();

		Product product = productDAO.findById(5);

		System.out.println(product.getId() + " | " + product.getProductCode() + " | " + product.getProductDescription()
				+ " | " + product.getQualityInStock() + " | " + product.getBuyPrice() + " | " + product.getMsrp());

	}
}