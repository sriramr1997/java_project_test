package com.example.java_project_test.Userservice;

import com.example.java_project_test.entity.User;
import com.example.java_project_test.repo.Userrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;
@Service
public class UserserviceImpl {

    @Autowired
    private Userrepo repo;

    public ResponseEntity<String> getUsers(User user) {
        User result = repo.save(user);
        return ResponseEntity.status(HttpStatus.OK).body("Created");


    }
}
