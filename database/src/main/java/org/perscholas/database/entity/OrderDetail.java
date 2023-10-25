package org.perscholas.database.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orderdetails")

public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name="order_id")
	private Integer orderId;
	
	@Column(name="product_id")
	private Integer ProductId;
	
	@Column(name="quantity_ordered")
	private Integer quantityOrdered;
	
	@Column(name="price_each",columnDefinition="Decimal(10,2)")
	private Double priceEach;
	
	@Column(name="order_line_number" ,columnDefinition="smallint")
	private Integer orderLineNo;

	// Getters and Setters
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

   public Integer getProductId() {
		return ProductId;
	}

	public void setProductId(Integer productId) {
		ProductId = productId;
	}

	public Integer getQuantityOrdered() {
		return quantityOrdered;
	}

	public void setQuantityOrdered(Integer quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public Double getPriceEach() {
		return priceEach;
	}

	public void setPriceEach(Double priceEach) {
		this.priceEach = priceEach;
	}

	public Integer getOrderLineNo() {
		return orderLineNo;
	}

	public void setOrderLineNo(Integer orderLineNo) {
		this.orderLineNo = orderLineNo;
	}
	

	

}
