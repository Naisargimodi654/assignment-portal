package com.portal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApiController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello, world!";
    }
}


