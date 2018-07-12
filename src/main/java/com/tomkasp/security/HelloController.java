package com.tomkasp.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tomasz Kasprzycki
 */
@RestController
@RequestMapping(value = "/api/hello")
public class HelloController {

    @GetMapping
    public String helloMethod() {
        return "Hello from secured";
    }
}
