package com.example.renderApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controll {

    @GetMapping("/api")
    public String hello() {
        return "hello";
    }
}
