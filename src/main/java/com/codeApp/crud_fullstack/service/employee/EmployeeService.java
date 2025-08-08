package com.codeApp.crud_fullstack.service.employee;

import com.codeApp.crud_fullstack.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee findByEmail(String email);
    Employee save(Employee c);
    List<Employee> findAll();
    Employee findById(Integer id);
    void deleteById(Integer id);
    Employee update(Employee e);
}
