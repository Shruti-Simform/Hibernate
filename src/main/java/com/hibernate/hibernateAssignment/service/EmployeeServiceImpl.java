package com.hibernate.hibernateAssignment.service;

import com.hibernate.hibernateAssignment.entity.Employee;
import com.hibernate.hibernateAssignment.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public List<Employee> findAllEmployee() {
        return employeeRepository.findAll();
    }
    public Employee findById(Integer empId){
        return employeeRepository.findById(empId).get();
    }
    public Employee insertEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}
