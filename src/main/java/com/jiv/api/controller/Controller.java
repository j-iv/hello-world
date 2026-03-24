package com.jiv.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/v1/hello/{name}")
    public String getHello(@PathVariable String name) {
        return "Hello, " + name;
    }
}
