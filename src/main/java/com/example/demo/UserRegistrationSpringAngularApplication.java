package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.EmployeeRepository;

@SpringBootApplication
public class UserRegistrationSpringAngularApplication {
	@Autowired
	private EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationSpringAngularApplication.class, args);
	}

}
