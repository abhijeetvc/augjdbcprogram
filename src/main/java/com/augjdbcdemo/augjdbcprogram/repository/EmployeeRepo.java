package com.augjdbcdemo.augjdbcprogram.repository;

import com.augjdbcdemo.augjdbcprogram.model.Employee;

import java.util.List;

public interface EmployeeRepo {

    List<Employee> getEmpList();

    Employee getEmployeeById(Integer id);

    String insertData(Employee employee);
}
