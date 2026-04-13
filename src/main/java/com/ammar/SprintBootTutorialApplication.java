package com.ammar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SprintBootTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprintBootTutorialApplication.class, args);
    }

    @GetMapping
    public String helloWorld(){
        return "Hello World Sprint Boot";
    }
}
