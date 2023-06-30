package com.hibernate.hibernateAssignment.service;

import com.hibernate.hibernateAssignment.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public List<Employee> findAllEmployee();
    public Employee findById(Integer empId);
    public Employee insertEmployee(Employee employee);
}
