package org.perscholas.springboot.controller;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.perscholas.springboot.database.dao.CustomerDAO;
import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.database.entity.User;
import org.perscholas.springboot.database.service.CustomerService;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.perscholas.springboot.security.AuthenticatedUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

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
   @Autowired
    private CustomerService customerservice;

   @Autowired
   private AuthenticatedUserService authenticatedUserService;


    @GetMapping("/customer/search")
    public ModelAndView search(@RequestParam(required = false) String search) {
        ModelAndView response = new ModelAndView("customer/search");

        log.debug("In the customer search container method: search parameter = " + search);

        if(search != null){
            List<Customer> customers = customerDao.findByFirstName(search);
            response.addObject("customersVar", customers);
            response.addObject("search", search);
            for (Customer customer : customers) {
                log.debug("customer: id = " + customer.getId() + " last name = " + customer.getLastName());
            }
        }

        return response;
    }
    //model to find customers using the first name and the last name
    @GetMapping("/customer/searchbyname")
    public ModelAndView searchByFirstNameandLastName(@RequestParam(required = false) String firstname,
                                                     @RequestParam(required = false) String lastname){
        ModelAndView response = new ModelAndView("customer/searchbyname");
        log.debug("In the customer search controller method:search parameter:"+firstname+" "+lastname);
        if(firstname!=null || lastname!=null)
        {
           // @Query("SELECT c FROM Customer c WHERE c.firstName LIKE concat('%',:firstName,'%') or c.lastName LIKE concat('%',:lastName,'%')")
            //List<Customer> findByFirstNameOrLastName(String firstName, String lastName);
            List<Customer> customers=customerDao.findByFirstNameAndLastNameStartWith(firstname+"%",lastname+"%");
            response.addObject("customersVar",customers);
            response.addObject("firstname",firstname);
            response.addObject("lastname",lastname);
            for (Customer customer :customers)

            {
                log.debug("customer: id "+customer.getId()+" First Name "+customer.getFirstName()+" Last Name "+customer.getLastName());
                log.debug("customer: Phone "+customer.getPhone()+" City "+customer.getCity());
            }

        }
        return response;
    }

    @GetMapping("/customer/create")
    public ModelAndView createCustomer() {
        ModelAndView response = new ModelAndView("customer/create");

        log.debug("In create customer with no args");

        return response;
    }


    // the action attribute on the form tag is set to /customer/createSubmit so this method will be called when the user clicks the submit button
    @GetMapping("/customer/createSubmit")
    public ModelAndView createCustomerSubmit(@Valid CreateCustomerFormBean form, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.info("######################### In create customer submit - has errors #########################");
            ModelAndView response = new ModelAndView("customer/create");

            for ( ObjectError error : bindingResult.getAllErrors() ) {
                log.info("error: " + error.getDefaultMessage());
            }

            response.addObject("form", form);
            response.addObject("errors", bindingResult);
            return response;
        }


        //another method of doing
       /* log.info("firstName: " + form.getFirstName());
        log.info("lastName: " + form.getLastName());
        log.info("phone: " + form.getPhone());
        log.info("city: " + form.getCity()); */

       /* Customer customer = new Customer();
        customer.setFirstName(form.getFirstName());
        customer.setLastName(form.getLastName());
        customer.setPhone(form.getPhone());
        customer.setCity(form.getCity());*/

       // customerDao.save(customer);

        log.info("  in Create customer no error found");
        //ModelAndView response = new ModelAndView("customer/create");
       Customer c = customerservice.createCustomer(form);
        ModelAndView response = new ModelAndView();
        response.setViewName("redirect:/customer/edit/" + c.getId() + "?success=Customer Saved Successfully");
       //customerservice.createCustomer(form);

        log.info("In create customer with incoming args");

        return response;
    }

    @GetMapping("/customer/edit/{customerId}")
    public ModelAndView editCustomer(@PathVariable int customerId, @RequestParam(required = false) String success) {
        log.info("######################### In /customer/edit #########################");
        ModelAndView response = new ModelAndView("customer/create");
        Customer customer = customerDao.findById(customerId);

        if (!StringUtils.isEmpty(success)) {
            response.addObject("success", success);
        }

        CreateCustomerFormBean form = new CreateCustomerFormBean();

        if (customer != null){
            form.setId(customer.getId());
            form.setFirstName(customer.getFirstName());
            form.setLastName(customer.getLastName());
            form.setPhone(customer.getPhone());
            form.setCity(customer.getCity());
            form.setImageUrl(customer.getImageUrl());
        } else{
            log.warn("Customer with id" + "was not found");
        }
        response.addObject("form", form);
        return response;
    }
    @GetMapping("/customer/myCustomers")
    public void myCustomers() {
        log.info("######################### In my customers #########################");
        // 1) Use the authenticated user service to find the logged in user
        User user = authenticatedUserService.loadCurrentUser();
        // 2) Create a DAO method that will find by userId
        // 3) use the authenticated user id to find a list of all customers created by this user
        List<Customer> customers = customerDao.findByUserId(user.getId());
        // 4) loop over the customers created and log.debug the customer id and customer last name
        for (Customer customer : customers){
            log.debug("customer: id = " + customer.getId() + " last name = " + customer.getLastName());
        }
    }

    @RequestMapping("/customer/detail")
    public ModelAndView detail(@RequestParam Integer id) {
        ModelAndView response = new ModelAndView("customer/detail");

        Customer customer = customerDao.findById(id);

        if (customer == null) {
            log.warn("Customer with id " + id + " was not found");
            // in a real application you might redirect to a 404 here because the custoemr was nto found
            response.setViewName("redirect:/error/404");
            return response;
        }

        response.addObject("customer", customer);

        return response;
    }
    @GetMapping("/customer/fileupload")
    public ModelAndView fileUpload(@RequestParam Integer id) {
        ModelAndView response = new ModelAndView("customer/fileupload");

        Customer customer = customerDao.findById(id);
        response.addObject("customer", customer);

        log.info(" In fileupload with no Args");
        return response;
    }

    @PostMapping("/customer/fileUploadSubmit")
    public ModelAndView fileUploadSubmit(@RequestParam("file") MultipartFile file,
                                         @RequestParam Integer id) {
        ModelAndView response = new ModelAndView("redirect:/customer/detail?id=" + id);

        log.info("Filename = " + file.getOriginalFilename());
        log.info("Size     = " + file.getSize());
        log.info("Type     = " + file.getContentType());


        // Get the file and save it somewhere
        File f = new File("./src/main/webapp/pub/images/" + file.getOriginalFilename());
        try (OutputStream outputStream = new FileOutputStream(f.getAbsolutePath())) {
            IOUtils.copy(file.getInputStream(), outputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // these 3 lines of code will load the customer by the id passed in
        // update the image url field and then save the customer to the database
        Customer customer = customerDao.findById(id);
        customer.setImageUrl("/pub/images/" + file.getOriginalFilename());
        customerDao.save(customer);

        return response;
    }
}
    // the action attribute on the form tag is set to /customer/createSubmit so this method will be called when the user clicks the submit button
  /*  @GetMapping("/customer/createSubmit")
    public ModelAndView createCustomerSubmit(CreateCustomerFormBean form) {
        log.info("######################### In create customer submit #########################");

        Customer c = customerservice.createCustomer(form);

        // the view name can either be a jsp file name or a redirect to another controller method
        ModelAndView response = new ModelAndView();
        response.setViewName("redirect:/customer/edit/" + c.getId() + "?success=Customer Saved Successfully");



        return response;
    }*/

    //    @GetMapping("/customer/delete/{customerId}")
//    public ModelAndView deleteCustomer(@PathVariable int customerId) {
//        ModelAndView response = new ModelAndView("customer/search");
//
//        Customer customer = customerDao.findById(customerId);
//
//        if ( customer != null ) {
//            customerDao.delete(customer);
//        } else {
//            log.warn("Customer with id " + customerId + " was not found") ;
//        }
//
//        return response;
//    }





