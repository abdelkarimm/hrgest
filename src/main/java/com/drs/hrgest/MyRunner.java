package com.drs.hrgest;

import com.drs.hrgest.model.Employee;
import com.drs.hrgest.repo.EmployeeRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
        private EmployeeRepo employeeRepo;

        public MyRunner(EmployeeRepo employeeRepo){
            this.employeeRepo = employeeRepo;
        }
        @Override
        public void run(String... args) throws Exception {
            employeeRepo.save(new Employee(1L,"karim","chinbou","engineer",12000));
            employeeRepo.save(new Employee(2L,"yasser","chinbou","doctor",15000));
            employeeRepo.save(new Employee(3L,"meryem","chinbou","architect",20000));
            employeeRepo.save(new Employee(4L,"hanane","benouakrim","commercial",13000));
        }
}
