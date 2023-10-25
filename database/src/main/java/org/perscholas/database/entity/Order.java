package org.perscholas.database.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="orders")

public class Order {

    public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;
 // this variable becomes read only because we have set
 	// insertable and updateble to false.
 	// we need to do this because we now have a @ManyToOne annotation
 	// that is working on the customer_id field also.
 	// these two do not need because it is for read only @Column(name = "customer_id", insertable = false, updatable = false)
    // private Integer customerId;
     
 	// https://attacomsian.com/blog/spring-data-jpa-one-to-many-mapping
 	@ManyToOne(fetch = FetchType.LAZY, optional = false)
     @JoinColumn(name = "customer_id", nullable = false)
     private Customer customer;
    
 	@OneToMany(mappedBy = "order", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<OrderDetail> orderDetails;
    
    @Column(name = "order_date")
    @Temporal(TemporalType.DATE)
    private Date orderDate;
	
    @Column(name = "required_date")
   // @Temporal(TemporalType.DATE)
    @Temporal(TemporalType.DATE)
     private Date requireddate;
    
    @Column(name = "shipped_date")
    @Temporal(TemporalType.DATE)
	 private Date shippeddate;
    
    @Column (name = "status")
	 private String status;
    
    @Column (name = "comments",columnDefinition = "TEXT")
	 private String comments;
    
    // -- getters and setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getRequireddate() {
		return requireddate;
	}

	public void setRequireddate(Date requireddate) {
		this.requireddate = requireddate;
	}

	public Date getShippeddate() {
		return shippeddate;
	}

	public void setShippeddate(Date shippeddate) {
		this.shippeddate = shippeddate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
    
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
    
	
	}
    
    
	
	


