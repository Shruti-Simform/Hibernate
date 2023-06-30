package com.hibernate.hibernateAssignment.controller;

import com.hibernate.hibernateAssignment.entity.EmploymentType;
import com.hibernate.hibernateAssignment.service.EmploymentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employmentType")
public class EmploymentTypeController {
    @Autowired
    EmploymentTypeService employmentTypeService;
    @GetMapping("/get")
    public List<EmploymentType> getAll(){
        return employmentTypeService.getAllEmploymentType();
    }
    @GetMapping("/get/{id}")
    public EmploymentType getById(@PathVariable Integer id){
        return employmentTypeService.getById(id);
    }
    @PostMapping("/add")
    public EmploymentType insert(@RequestBody EmploymentType employmentType){
        return employmentTypeService.insertEmploymentType(employmentType);
    }
}
