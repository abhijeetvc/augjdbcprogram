package com.augjdbcdemo.augjdbcprogram.controller;

import com.augjdbcdemo.augjdbcprogram.dao.EmployeeDao;
import com.augjdbcdemo.augjdbcprogram.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping(value="/getemp")
    public List<Employee> getEmployees(){
        List<Employee> list=employeeDao.getEmpList();
        return list;
    }
}
