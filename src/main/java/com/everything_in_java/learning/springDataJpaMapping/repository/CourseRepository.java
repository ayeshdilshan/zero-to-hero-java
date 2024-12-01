package com.everything_in_java.learning.springDataJpaMapping.repository;

import com.everything_in_java.learning.springDataJpaMapping.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {
}
