package com.app.moenymanager.Backend;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class EmpController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("employee")
    public List<Employee> getemployee() {
        return employeeService.readEmployee();
    }

    @PostMapping("create_employee")
    public String createEmployee(@RequestBody Employee employee) {
        return employeeService.creatEmployee(employee);
    }

    @DeleteMapping("delete_employee/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        if (employeeService.deleteEmployee(id)) {
            return "Your account is deleted succefully";
        }
        return "User not found";
    }

}
