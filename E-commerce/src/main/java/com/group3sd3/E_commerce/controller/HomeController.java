package com.group3sd3.E_commerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin/admin_dashboard";
    }

    @GetMapping("/seller")
    public String seller() {
        return "seller/seller_dashboard";
    }

    @GetMapping("/products")
    public String products() {
        return "product";
    }

    @GetMapping("/product")
    public String product() {
        return "view_product";
    }
    
}
