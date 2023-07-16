package com.example.java_project_test.repo;

import com.example.java_project_test.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userrepo extends JpaRepository <User ,Long> {
}
