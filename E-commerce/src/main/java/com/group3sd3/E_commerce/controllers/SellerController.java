package com.group3sd3.E_commerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/seller")
public class SellerController {

    @GetMapping("/")
    public String SellerIndex() {
        return "seller/index";
    }

    @GetMapping("/add_product")
    public String AddProduct() {
        return "seller/add_product";
    }
    
}
