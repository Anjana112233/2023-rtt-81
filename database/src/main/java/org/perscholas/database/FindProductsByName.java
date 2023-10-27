package org.perscholas.database;
import java.util.List;
import java.util.Scanner;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.dao.OrderDAO;
import org.perscholas.database.dao.ProductDAO;
import org.perscholas.database.entity.Order;
import org.perscholas.database.entity.Product;

public class FindProductsByName {
	private ProductDAO productDao = new ProductDAO();

	public static void main(String[] args) {

		FindProductsByName findProduct = new FindProductsByName();
		findProduct.findProductsByName();

	}

	public void findProductsByName() {
		Product product = new Product();
		OrderDAO orderDao = new OrderDAO();

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Product Name");
		String prodName = scanner.next();

		// String hql = "FROM Product p WHERE p.productName like :prodName";
		String hql = "FROM Product p WHERE p.productName LIKE  CONCAT('%', :prodName, '%')";
		TypedQuery<Product> query = session.createQuery(hql, Product.class);

		query.setParameter("prodName", prodName);

		List<Product> products = query.getResultList();
		if (products.size() > 0) {

			for (Product p : products) {
				System.out.println(p.getId() + "       " + p.getProductName());
			}
			System.out.println("Select a product Id:");
			int productId = scanner.nextInt();

			System.out.println("Please enter the order number to add up this product ID: " + productId);
			int orderId = scanner.nextInt();

			Order o = orderDao.findById(orderId);
			if (o != null) {
				System.out.println(o.getId());
				// we have disabled the insert option for OrderId and productId
				// So we cannot make entry in orderDetails table.
			} else {
				System.out.println("The Order Number does not exist");
			}

		} else {
			System.out.println("Product with name " + prodName + " does not exist");
		}


	}

}
	
	


