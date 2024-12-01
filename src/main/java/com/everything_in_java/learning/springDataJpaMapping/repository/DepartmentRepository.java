package com.everything_in_java.learning.springDataJpaMapping.repository;

import com.everything_in_java.learning.springDataJpaMapping.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
