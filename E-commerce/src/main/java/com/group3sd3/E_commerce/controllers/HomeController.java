package com.group3sd3.E_commerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;






@Controller
public class HomeController {
    @GetMapping("/")
    public String Index() {
        return "index";
    }

    @GetMapping("/login")
    public String Login() {
        return "login";
    }

    @GetMapping("/register")
    public String Register() {
        return "register";
    }

    @GetMapping("/products")
    public String Products() {
        return "product";
    }

    @GetMapping("/product")
    public String ViewProduct() {
        return "view_product";
    }
    @GetMapping("/cart")
    public String cart() {
        return "cart";
    
    }
    @GetMapping("/myaccount")
    public String myaccount() {
        return "myaccount";
    }
    
    
}