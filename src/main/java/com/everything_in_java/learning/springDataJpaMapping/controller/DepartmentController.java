package com.everything_in_java.learning.springDataJpaMapping.controller;

import com.everything_in_java.learning.springDataJpaMapping.model.Department;
import com.everything_in_java.learning.springDataJpaMapping.model.Employee;
import com.everything_in_java.learning.springDataJpaMapping.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping
    public Department saveDepartment(@RequestBody Department department) {

        // Set the department for each employee
        for (Employee employee : department.getEmployees()) {
            employee.setDepartment(department);
        }
        return departmentRepository.save(department);

    }
}
