package com.drs.hrgest.controller;

import com.drs.hrgest.model.Employee;
import com.drs.hrgest.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    private EmployeeService employeeService;

    EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }


    @GetMapping("/index")
    public String index(){
        return "It Works";
    }

    @GetMapping("/all")
    public List<Employee> employeeList(){
        List<Employee> employeeList = employeeService.getEmployees();
        return employeeList;
    }

    @GetMapping("/{id}")
    public Employee employee(@PathVariable("id") Long id){
        return employeeService.findEmployee(id);
    }

    @PostMapping("/new")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);

    }

    @PostMapping("/{id}/update")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
        return "the employee number "+ id+" was deleted successfully";
    }

}
