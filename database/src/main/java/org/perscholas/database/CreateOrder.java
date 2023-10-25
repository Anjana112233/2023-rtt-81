package org.perscholas.database;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.perscholas.database.dao.CustomerDAO;
import org.perscholas.database.dao.OrderDAO;
import org.perscholas.database.entity.Customer;
import org.perscholas.database.entity.Order;
import org.perscholas.database.entity.OrderDetail;

public class CreateOrder {
	public static void main(String[] args) throws ParseException {
		CreateOrder oc = new CreateOrder();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Customer ID:");

		int customerId = scanner.nextInt();

		oc.insertOrder(customerId);
		

	}

	public void insertOrder(int custId) throws ParseException {

		CustomerDAO customerdao = new CustomerDAO();
		OrderDAO orderDAO = new OrderDAO();

		Customer c = customerdao.findById(custId);
		if(c!=null)
		{
		Date date = new Date();

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date requiredDate = df.parse("2023-10-31");
		Order o = new Order();
		o.setCustomer(c);
		o.setComments("Shipping in progress");
		o.setOrderDate(date);
		o.setShippeddate(null);
		o.setStatus("In Process");
		o.setRequireddate(requiredDate);

		orderDAO.save(o);

		/*
		 * System.out.println("id Before save:" + o.getId());
		 * System.out.println("Order Saved");
		 * 
		 * System.out.println("id After save:" + o.getId());
		 */
		}
		else
		{
			System.out.println("Customer does not exist");
		}

	}
			

}
