package com.augjdbcdemo.augjdbcprogram.dao;

import com.augjdbcdemo.augjdbcprogram.model.Employee;
import com.augjdbcdemo.augjdbcprogram.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDao implements EmployeeRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Employee> getEmpList() {

        String sql="select * from employee";
        List<Employee> list=jdbcTemplate.query(sql,
                new BeanPropertyRowMapper<>(Employee.class));
        return list;
    }

    @Override
    public Employee getEmployeeById(Integer id) {

        String sql="select * from employee where id=?";
        Employee e=jdbcTemplate.queryForObject(sql,new Object[]{id},
                new BeanPropertyRowMapper<>(Employee.class));
        return e;
    }

    @Override
    public String insertData(Employee employee) {

        String sql="insert into employee values (?,?,?)";
        jdbcTemplate.update(sql, new Object[]{employee.getId(),employee.getName(),employee.getCity()});
        return "Data saved";
    }
}
