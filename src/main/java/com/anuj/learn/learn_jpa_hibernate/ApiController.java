package com.anuj.learn.learn_jpa_hibernate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/all")
    public String getAllNameList(){
        return "Hello World...";
    }
}
