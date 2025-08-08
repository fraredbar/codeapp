package com.codeApp.crud_fullstack.service.employee;

import com.codeApp.crud_fullstack.entity.Employee;
import com.codeApp.crud_fullstack.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;


    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee save(Employee c) {
        return employeeRepository.save(c);
    }

    @Override
    public List<Employee> findAll() {
        return List.of();
    }

    @Override
    public Employee findById(Integer id) {
        return employeeRepository.findById(id).get();
    }



    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Employee update(Employee e) {
        return null;
    }

    @Override
    public Employee findByEmail(String email) {
        return employeeRepository.findByEmail(email).orElseThrow();
    }

}
