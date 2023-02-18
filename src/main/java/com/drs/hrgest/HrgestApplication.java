package com.drs.hrgest;

import com.drs.hrgest.model.Employee;
import com.drs.hrgest.repo.EmployeeRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class HrgestApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrgestApplication.class, args);
	}

}
