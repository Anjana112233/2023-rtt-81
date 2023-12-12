package org.perscholas.springboot.database.service;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.CustomerDAO;
import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.database.entity.User;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.perscholas.springboot.security.AuthenticatedUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomerService {
    @Autowired
    private CustomerDAO customerDAO;

    @Autowired
    private AuthenticatedUserService authenticatedUserService;
    public Customer createCustomer(CreateCustomerFormBean form){
        log.debug("id: " + form.getId());
        log.debug("firstName: "+ form.getFirstName());
        log.info("lastName: "+ form.getLastName());
        log.info("phone: "+ form.getPhone());
        log.info("city: "+ form.getCity());

        // if the form.id is null then this is a create - if it is not null then it is an edit
        // first we attempt to load it from the database ( basically we assume that it is going to be an edit )
        // if it was found in the database we know the incoming id was valid so we can edit it
        Customer customer = customerDAO.findById(form.getId());

        // if the customer is null then we know that this is a create and we have to make a new object
        if (customer == null){
            customer = new Customer();
            //these line of code loads the current logged in user record from the database

            User user = authenticatedUserService.loadCurrentUser();

            customer.setUserId(user.getId());

        }
        // set the incoming values to be save to the database
        customer.setFirstName(form.getFirstName());
        customer.setLastName(form.getLastName());
        customer.setPhone(form.getPhone());
        customer.setCity(form.getCity());
       // customerDAO.save(customer);
        customer.setImageUrl(form.getImageUrl());

        //this one is only after edit customer otherwise use line 37
        return customerDAO.save(customer);

    }

}
