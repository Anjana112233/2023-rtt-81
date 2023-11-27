package org.perscholas.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.EmployeeDAO;
import org.perscholas.springboot.database.entity.Employee;
import org.perscholas.springboot.formbean.CreateEmployeeFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller

public class EmployeeController {
    @Autowired

    private EmployeeDAO employeeDao;

    @GetMapping("/employee/createemp")
    public ModelAndView createEmployee() {
        ModelAndView response = new ModelAndView("employee/createemp");
        log.info("In create employee with no args");
        return response;
    }
    @GetMapping("/employee/createempSubmit")
    public ModelAndView createEmployeeSubmit(CreateEmployeeFormBean form){
        ModelAndView response = new ModelAndView("employee/createemp");
        Employee employee = new Employee();
        employee.setFirstName(form.getFirstName());
        employee.setLastName(form.getLastName());
        employee.setDepartmentName(form.getDepartment());


        employeeDao.save(employee);

        log.info("In create employee with incoming args");

        return response;

    }
}
