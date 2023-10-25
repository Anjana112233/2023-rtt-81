package org.perscholas.database.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Customer;
import org.perscholas.database.entity.Product;


public class ProductDAO {
	public Product findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		//names are based on java object names
		String hql = "FROM Product p WHERE p.id = :id"; // Example of HQL to get all records of user class

		TypedQuery<Product> query = session.createQuery(hql, Product.class);
		//query.setParameter(1, id);
		query.setParameter("id", id);

		Product result = query.getSingleResult();
		return result;
	}
	public void save(Product save) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		//session.beginTransaction();
		//session.save(save);

		Transaction t = session.beginTransaction();
		session.saveOrUpdate(save);
		t.commit();

	}
	public List<Product> findByName(String name) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		
		String hql = "FROM Product p WHERE p.productName = :name";

		TypedQuery<Product> query = session.createQuery(hql, Product.class);
		query.setParameter("name", name);

		List<Product> result = query.getResultList();
		return result;
	}
	

}
