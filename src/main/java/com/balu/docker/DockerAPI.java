package com.balu.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerAPI {


    @GetMapping("/healthCheck")
    public String healthCheck() {
        return "Spring Boot is running successfully....";
    }
}
