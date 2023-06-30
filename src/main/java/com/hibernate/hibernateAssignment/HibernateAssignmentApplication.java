package com.hibernate.hibernateAssignment;

import com.hibernate.hibernateAssignment.entity.FullTimeEmployee;
import com.hibernate.hibernateAssignment.entity.PartTimeEmployee;
import com.hibernate.hibernateAssignment.repository.EmploymentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateAssignmentApplication implements CommandLineRunner {

	@Autowired
	EmploymentTypeRepository employmentTypeRepository;
	public static void main(String[] args) {
		SpringApplication.run(HibernateAssignmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
          employmentTypeRepository.save(new FullTimeEmployee(2000,"9-5 PM"));
		  employmentTypeRepository.save(new PartTimeEmployee(100,"1-4 PM"));
	}
}
