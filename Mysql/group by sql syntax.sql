select distinct contact_firstname, contact_lastname
from customers
order by contact_firstname asc;

delete from customers
where customer_name = '%hibernate customer%' and id > 498;

--


select firstname from employees order by firstname;

select distinct city 
from customers 
where city like'%-%' 
order by city asc;

insert into customers (customer_name, contact_lastname, contact_firstname, phone, address_line1, address_line2, city, state, postal_code, country)
		values ('Series Reminder', 'Hellig', 'Eric', '555-555-1212', 'Address Line 1', 'Adress Line2', 'Denver', 'CO', 80203, 'USA');
 
 
select * from customers where contact_lastname = 'Hellig';

-- -------------------------------------------------------------------------------------------------

select * from employees where office_id = 1;
select * from offices where city like '%o%';

-- we want to see the products in a particular order
select * from orders;
select * from orderdetails;
select * from products;

-- it calculates the profit and total profit for each item
select o.id, p.id as product_id, p.product_name, od.quantity_ordered, p.buy_price, p.msrp, (p.msrp - p.buy_price) as profit, ((p.msrp - p.buy_price) * od.quantity_ordered) as total_profit
from orders o, orderdetails od, products p
where o.id = '10100'
and od.order_id = o.id
and od.product_id = p.id;

-- how many district products are in the order 10100
select o.id, count(*)
from orders o, orderdetails od
where o.id = od.order_id
group by o.id;

-- how many employees are in each office
select o.city, count(*)
from employees e, offices o
where e.office_id = o.id
group by o.id;

-- show me the total quantity ordered for each product across all customers
-- select p.id, od.order_id, p.product_name, sum(od.quantity_ordered) as total_quantity_ordered


-- what product appears in the most orders
select p.product_name, count(*) as order_count
from orderdetails od, products p
where p.id = od.product_id
group by product_id
order by order_count desc;

-- what product has the highest quanity ordered
select p.product_name, sum(quantity_ordered) as total_ordered, count(*) as order_count, avg(quantity_ordered) as avg_per_order
from orderdetails od, products p
where p.id = od.product_id
group by product_id
order by order_count desc;


-- show me the customer name and the total number of orders for that customer - useing count(*)
-- show me the custoemr name and the total number distint products ordered  - using count(*)
-- show me the customer name, the product name, and the total quantaity orderd of each product - using sum()
-- show me the name of the product line and the number of products in each product line



