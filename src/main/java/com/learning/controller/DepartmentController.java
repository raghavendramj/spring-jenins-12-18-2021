package com.learning.controller;

import com.learning.entity.Department;
import com.learning.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public List<Department> getDepartments(){
        return departmentService.getDepartments();
    }

    @GetMapping("/depatments/{id}")
    Department getDepartmentById(@PathVariable("id") Long id){
        return new Department(126l, "ECE", "Mumbai", "EC-02");
    }
   
}
