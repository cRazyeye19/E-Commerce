package com.group3sd3.foobar;

import org.springframework.stereotype.Component;

@Component
public class Welcome {
    
    public String welcomeMessage() {
        return "Welcome to the world of Spring Boot";
    }
}
