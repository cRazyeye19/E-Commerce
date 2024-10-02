package com.group3sd3.E_commerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
    @GetMapping("/settings")
    public String settings() {
        return "settings";
    }
    @GetMapping("/watchlist")
    public String watchlist() {
        return "watchlist";
    }
    @GetMapping("/home")
    public String home(){
        return "index";
    }
    @GetMapping("/tshirt")
    public String tshirt() {
        return "products_clothing";
    }
    @GetMapping("/purchase")
    public String purchase() {
        return "purchases";
    }
    @GetMapping("/listings")
    public String listing() {
        return "listings";
    }
    @GetMapping("/admin")
    public String admin() {
        return "admin_dashboard";
    }

    @GetMapping("/seller")
    public String seller() {
        return "seller_dashboard";
    }
}