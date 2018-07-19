package com.tomkasp.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tomasz Kasprzycki
 */
@RestController
@RequestMapping(value = "/api/notsecured")
public class NotSecuredController {

    @GetMapping
    public String notSecured(){
        return "not secured";
    }
}
