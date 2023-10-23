package org.perscholas.database;




import org.perscholas.database.dao.OrderDAO;
import org.perscholas.database.entity.Order;


public class HibernateOrder {
	public static void main(String[] args) {
		OrderDAO orderDao = new OrderDAO();
		//Order order = new Order();
		
		 Order order = orderDao.findById(10100);
		
		System.out.println( order.getId() + " | " + order.getOrderDate());
	}
	


}
