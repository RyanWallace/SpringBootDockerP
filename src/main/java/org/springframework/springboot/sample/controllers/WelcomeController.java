package org.springframework.springboot.sample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class WelcomeController {

    @GetMapping("/")
    public String welcome() {
        return "Hello World!";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "Goodbye Cruel World!";
    }
}
