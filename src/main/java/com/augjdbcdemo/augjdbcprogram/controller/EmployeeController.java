package com.augjdbcdemo.augjdbcprogram.controller;

import com.augjdbcdemo.augjdbcprogram.dao.EmployeeDao;
import com.augjdbcdemo.augjdbcprogram.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping(value="/getemp")
    public List<Employee> getEmployees(){
        List<Employee> list=employeeDao.getEmpList();
        return list;
    }

    @GetMapping(value="/getempbyid/{id}/{name}")
    public Employee getEmployeeById(@PathVariable Integer id,
                                    @PathVariable String name){
        Employee emp=employeeDao.getEmployeeById(id);
        return emp;
    }

    @PostMapping(value="/savedata")
    public String saveData(@RequestBody Employee employee){
        String str=employeeDao.insertData(employee);
        return str;
    }

    @PutMapping(value="/updateemp/{id}/{name}")
    public String updateEmployee(@PathVariable Integer id,
                                    @PathVariable String name){
       String str=employeeDao.updateEmp(id,name);
        return str;
    }

    @GetMapping(value="/getjoindata")
    public List<Map<String,Object>> getCombinedEmployees(){
        List<Map<String,Object>> list=employeeDao.getCombinedData();
        return list;
    }

}
