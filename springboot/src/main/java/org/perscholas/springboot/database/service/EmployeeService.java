package org.perscholas.springboot.database.service;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.CustomerDAO;
import org.perscholas.springboot.database.dao.EmployeeDAO;
import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.database.entity.Employee;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.perscholas.springboot.formbean.CreateEmployeeFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;

    public void createEmployee(CreateEmployeeFormBean form){
        log.debug("id: " + form.getId());
        log.debug("firstName: "+ form.getFirstName());
        log.info("lastName: "+ form.getLastName());
        log.info("department: "+ form.getDepartment());

        Employee employee = employeeDAO.findById(form.getId());

        if (employee == null){
            employee = new Employee();
        }
        // set the incoming values to be save to the database
        employee.setFirstName(form.getFirstName());
        employee.setLastName(form.getLastName());
        employee.setDepartmentName(form.getDepartment());

        employeeDAO.save(employee);

    }


}
