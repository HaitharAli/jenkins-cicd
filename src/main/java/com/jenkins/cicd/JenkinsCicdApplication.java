package com.jenkins.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsCicdApplication {

    @GetMapping("/jenkins")
    public String getMessage() {
        return "Welcome to Jenkins CI/CD pipeline!!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkinsCicdApplication.class, args);
    }

}
