package com.keval.app;

import com.keval.app.generated.tables.pojos.User;
import com.keval.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/db")
public class Controller {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userRepository.getAllUsers());
    }
}
