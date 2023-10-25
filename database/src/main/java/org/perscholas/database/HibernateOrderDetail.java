package org.perscholas.database;
import org.perscholas.database.dao.OrderDetailDAO;
import org.perscholas.database.entity.OrderDetail;


public class HibernateOrderDetail {
	public static void main(String[] args) {
	    OrderDetailDAO orderDetailDAO = new OrderDetailDAO();
			
			OrderDetail orderDetail = orderDetailDAO.findById(4);
			
			System.out.println( orderDetail.getId() + " | "+ orderDetail.getProductId()+ " | "+ orderDetail.getOrderLineNo() +  " | "+ 
			orderDetail.getOrderId()+" | " +orderDetail.getPriceEach()+ " | " +orderDetail.getQuantityOrdered());
	}
	

}
