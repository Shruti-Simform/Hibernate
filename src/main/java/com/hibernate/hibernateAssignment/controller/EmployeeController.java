package com.hibernate.hibernateAssignment.controller;

import com.hibernate.hibernateAssignment.entity.Department;
import com.hibernate.hibernateAssignment.entity.Employee;
import com.hibernate.hibernateAssignment.repository.EmploymentTypeRepository;
import com.hibernate.hibernateAssignment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @Autowired
    EmploymentTypeRepository employmentTypeRepository;

    @GetMapping("/get")
    public List<Employee> findAll(){
        return employeeService.findAllEmployee();
    }

    @GetMapping("/get/{empId}")
    public Employee findById(@PathVariable Integer empId){
        return employeeService.findById(empId);
    }

    @PostMapping("/add")
    public Employee insertEmployee(@RequestBody Employee employee){
        Employee currentEmployee =  new Employee();
//        Department thisdept = employee.getDepartment();
        currentEmployee.setDepartment(employee.getDepartment());
       // employmentTypeRepository.save(employee.getEmploymentType());
        currentEmployee.setEmploymentType(employee.getEmploymentType());
        currentEmployee.setEmpId(employee.getEmpId());
        currentEmployee.setEmpName(employee.getEmpName());
        return employeeService.insertEmployee(currentEmployee);
    }
}
