package com.group3sd3.E_commerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin")
    public String AdminIndex() {
        return "admin/index";
    }

    @GetMapping("/category")
    public String Category() {
        return "admin/category";
    }
}
