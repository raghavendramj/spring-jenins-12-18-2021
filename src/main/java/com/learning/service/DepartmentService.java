package com.learning.service;


import com.learning.entity.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getDepartments();
    Department getDepartmentById(Long departmentId);
}
