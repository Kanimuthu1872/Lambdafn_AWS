package org.example.controller;

import org.example.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {
    List<Employee> allEmployees=List.of(new Employee(1,"Kanimuthu"));




    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return allEmployees;
    }


}
