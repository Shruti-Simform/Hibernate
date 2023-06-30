package com.hibernate.hibernateAssignment.controller;

import com.hibernate.hibernateAssignment.entity.PartTimeEmployee;
import com.hibernate.hibernateAssignment.repository.PartTimeEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/partTime")
public class PartTimeEmployeeController {
    @Autowired
    PartTimeEmployeeRepository partTimeEmployeeRepository;
    @GetMapping("/get")
    public List<PartTimeEmployee> getAll(){
        return partTimeEmployeeRepository.findAll();
    }
    @GetMapping("/get/{id}")
    public PartTimeEmployee getByID(@PathVariable Integer id){
        return partTimeEmployeeRepository.findById(id).get();
    }
    @PostMapping("/add")
    public PartTimeEmployee insert(@RequestBody PartTimeEmployee partTimeEmployee){
        return partTimeEmployeeRepository.save(partTimeEmployee);
    }
}
