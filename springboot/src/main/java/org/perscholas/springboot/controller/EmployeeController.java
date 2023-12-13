package org.perscholas.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.EmployeeDAO;
import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.database.entity.Employee;
import org.perscholas.springboot.database.service.EmployeeService;
import org.perscholas.springboot.formbean.CreateEmployeeFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller

public class EmployeeController {
    @Autowired

    private EmployeeDAO employeeDao;

    @Autowired
    private EmployeeService employeeService;



    @GetMapping("/employee/createemp")
    public ModelAndView createEmployee() {
        ModelAndView response = new ModelAndView("employee/createemp");
        log.info("In create employee with no args");
        return response;
    }
    @GetMapping("/employee/createempSubmit")
   /* public ModelAndView createEmployeeSubmit(CreateEmployeeFormBean form){
        ModelAndView response = new ModelAndView("employee/createemp");
        Employee employee = new Employee();
        employee.setFirstName(form.getFirstName());
        employee.setLastName(form.getLastName());
        employee.setDepartmentName(form.getDepartment());*/


       // employeeDao.save(employee);
    public ModelAndView createEmployeeSubmit(CreateEmployeeFormBean form) {
        ModelAndView response = new ModelAndView("employee/createemp");

        employeeService.createEmployee(form);


        log.info("In create employee with incoming args");

        return response;

    }
    @GetMapping("/employee/searchbyname")
    public ModelAndView searchByFirstNameandLastName(@RequestParam(required = false) String firstname, @RequestParam(required = false) String lastname){
        ModelAndView response = new ModelAndView("employee/searchbyname");
        log.debug("In the employer search controller method:search parameter:"+firstname+" "+lastname);
        if(firstname!=null || lastname!=null)
        {

            List<Employee> employees=employeeDao.findByFirstNameAndLastNameStartWith(firstname+"%",lastname+"%");
            response.addObject("employeesVar",employees);
            response.addObject("firstname",firstname);
            response.addObject("lastname",lastname);
            for (Employee employee :employees)

            {
                log.debug("employee: id "+employee.getId()+" First Name "+employee.getFirstName()+" Last Name "+employee.getLastName());
                log.debug("employee: DepartmentName "+employee.getDepartmentName());
            }

        }
        return response;
    }
    //this is for edit employee
    @GetMapping("/employee/edit/{employeeId}")
    public ModelAndView editEmployee(@PathVariable int employeeId) {
        ModelAndView response = new ModelAndView("employee/createemp");

        Employee employee = employeeDao.findById(employeeId);

        CreateEmployeeFormBean form = new CreateEmployeeFormBean();

        if (employee != null) {
            form.setId(employee.getId());
            form.setFirstName(employee.getFirstName());
            form.setLastName(employee.getLastName());
            form.setDepartment(employee.getDepartmentName());

        } else {
            log.warn("employee with id " + employeeId + " was not found");
        }

        response.addObject("form", form);

        return response;
    }
    }
