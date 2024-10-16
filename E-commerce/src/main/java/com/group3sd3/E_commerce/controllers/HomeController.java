package com.group3sd3.E_commerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


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

    @GetMapping("/reset") 
    public String reset() {
        return "reset";
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

    @GetMapping("acategories")
    public String acategories() {
        return "admin_categories";
    }
    @GetMapping("checkout")
    public String checkout() {
        return "checkout";
    }
    @GetMapping("payment")
    public String payment() {
        return "payment";
    }
    @GetMapping("success")
    public String success() {
        return "success";
    }

    /* Kurt's Testing Mapping For Design */
    @GetMapping("/admin")
    public String admin() {
        return "/admin/admin_dashboard";
    }

    // @GetMapping("/seller")
    // public String seller() {
    //     return "/seller/seller_dashboard";
    // }

    @GetMapping("/seller")
    public String seller() {
        return "seller_dashboard";
    }
    
    // /* FOR THE MEAN TIME AND FOR TESTING */
    // @GetMapping("/orders")
    // public String orders() {
    //     return "seller_orders";
    // }
    // @GetMapping("/analytics")
    // public String analytics() {
    //     return "seller_analytics";
    // }
    // @GetMapping("/messages")
    // public String messages() {
    //     return "seller_messages";
    // }
    // @GetMapping("/sproducts")
    // public String sproducts() {
    //     return "seller_products";
    // }
    // @GetMapping("/ssettings")
    // public String ssettigs() {
    //     return "seller_settings";
    // }

}

