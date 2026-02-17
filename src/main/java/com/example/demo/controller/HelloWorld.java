package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @PutMapping("/hello")
    public ResponseEntity<?> helloWorld(){
        return new ResponseEntity<>("Hello World Using Jenkins", HttpStatus.OK);
    }
}
