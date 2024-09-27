package com.group3sd3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    
    @GetMapping("/login")
    public String Login() {
        return "login";
    }

    @GetMapping("/register")
    public String Register() {
        return "register";
    }
    
}
