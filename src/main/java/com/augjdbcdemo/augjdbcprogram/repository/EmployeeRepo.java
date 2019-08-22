package com.augjdbcdemo.augjdbcprogram.repository;

import com.augjdbcdemo.augjdbcprogram.model.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeRepo {

    List<Employee> getEmpList();

    Employee getEmployeeById(Integer id);

    String insertData(Employee employee);

    String updateEmp(Integer id,String name);

    List<Map<String,Object>> getCombinedData();
}
