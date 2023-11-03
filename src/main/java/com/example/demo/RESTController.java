package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {

    @Autowired
    MyService myService;

    @PostMapping("/test")
    public ResponseEntity<String> sample() {
        String s = myService.getValueForKey("key-1");
        return new ResponseEntity<>(s, HttpStatus.OK);
    }
}
