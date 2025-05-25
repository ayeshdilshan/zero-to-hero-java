package com.everything_in_java.learning.springDataJpaMapping.repository;

import com.everything_in_java.learning.springDataJpaMapping.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    boolean existsByEmail(String email);
}
