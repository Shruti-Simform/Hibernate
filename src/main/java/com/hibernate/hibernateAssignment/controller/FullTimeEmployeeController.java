package com.hibernate.hibernateAssignment.controller;

import com.hibernate.hibernateAssignment.entity.FullTimeEmployee;
import com.hibernate.hibernateAssignment.repository.FullTimeEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fullTime")
public class FullTimeEmployeeController {
    @Autowired
    FullTimeEmployeeRepository fullTimeEmployeeRepository;
    @GetMapping("/get")
    public List<FullTimeEmployee> getAll(){
        return fullTimeEmployeeRepository.findAll();
    }
    @GetMapping("/get/{id}")
    public FullTimeEmployee getByID(@PathVariable Integer id){
        return fullTimeEmployeeRepository.findById(id).get();
    }
    @PostMapping("/add")
    public FullTimeEmployee insert(@RequestBody FullTimeEmployee fullTimeEmployee){
        return fullTimeEmployeeRepository.save(fullTimeEmployee);
    }
}
