package org.james.spring.security.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")
public class SecurityApiController {

    @GetMapping("/getMessage")
    public String greeting() {
        return "Hello world from Spring Security demo";
    }
}
