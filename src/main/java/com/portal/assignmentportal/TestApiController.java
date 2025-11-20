package com.portal.assignmentportal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApiController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from TestApiController!";
    }
}
