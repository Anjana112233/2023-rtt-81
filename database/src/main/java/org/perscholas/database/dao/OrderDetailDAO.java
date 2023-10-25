package org.perscholas.database.dao;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Customer;
import org.perscholas.database.entity.OrderDetail;

public class OrderDetailDAO {
	public OrderDetail findById(Integer orderId) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM OrderDetail od WHERE od.id = :orderId"; // Example of HQL to get all records of user class
        
		System.out.println(hql);
		
		TypedQuery<OrderDetail> query = session.createQuery(hql, OrderDetail.class);
		
		query.setParameter("id", orderId);

		OrderDetail result = query.getSingleResult();
		return result;
	}
	public void save(OrderDetail orderDetail) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		//session.beginTransaction();
		//session.save(save);

		Transaction t = session.beginTransaction();
		session.saveOrUpdate(orderDetail);
		t.commit();
		session.close();

	}
}
