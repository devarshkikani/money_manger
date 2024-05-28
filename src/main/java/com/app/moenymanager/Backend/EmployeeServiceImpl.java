package com.app.moenymanager.Backend;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees = new ArrayList<>();

    @Override
    public String creatEmployee(Employee employee) {
        employees.add(employee);
        return employee.getName() + "saved succesfully";
    }

    @Override
    public List<Employee> readEmployee() {
        return employees;
    }

    @Override
    public boolean deleteEmployee(Long id) {
        employees.remove(id);
        return true;
    }

}
