package org.perscholas.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.CustomerDAO;
import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Slf4j
@Controller
//controller helps to connect the html page and code
//public class CustomerController {
/*    @GetMapping("/customer/create")
    public ModelAndView createCustomer(@RequestParam(required = false) String firstName,
                                       @RequestParam(required = false) String lastName,
                                       @RequestParam(required = false) String phone,
                                       @RequestParam(required = false) String city){
       ModelAndView response = new ModelAndView("customer/create");
       System.out.println("firstName:" + firstName); //+ firstname goes in the URL if we type xyz instead of firstname , it will show xyz in url
        System.out.println("lastName:" + lastName);
        System.out.println("phone:" + phone);
        System.out.println("city:" + city);
               return response;
    }
}*/
public class CustomerController {

    @Autowired
    private CustomerDAO customerDao;

    @GetMapping("/customer/create")
    public ModelAndView createCustomer() {
        ModelAndView response = new ModelAndView("customer/create");

        log.info("In create customer with no args");

        return response;
    }


    // the action attribute on the form tag is set to /customer/createSubmit so this method will be called when the user clicks the submit button
    @GetMapping("/customer/createSubmit")
    public ModelAndView createCustomerSubmit(CreateCustomerFormBean form) {
        ModelAndView response = new ModelAndView("customer/create");

        //another method of doing
       /* log.info("firstName: " + form.getFirstName());
        log.info("lastName: " + form.getLastName());
        log.info("phone: " + form.getPhone());
        log.info("city: " + form.getCity()); */

        Customer customer = new Customer();
        customer.setFirstName(form.getFirstName());
        customer.setLastName(form.getLastName());
        customer.setPhone(form.getPhone());
        customer.setCity(form.getCity());

        customerDao.save(customer);

        log.info("In create customer with incoming args");

        return response;
    }


}