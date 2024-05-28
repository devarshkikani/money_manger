package com.app.moenymanager.Backend;

import java.util.List;

public interface EmployeeService {
    String creatEmployee(Employee employee);

    List<Employee> readEmployee();

    boolean deleteEmployee(Long id);
}
