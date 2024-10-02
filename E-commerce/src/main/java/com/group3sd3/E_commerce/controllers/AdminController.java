package com.group3sd3.E_commerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.group3sd3.E_commerce.model.categoryModel;
import com.group3sd3.E_commerce.services.categoryService;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private categoryService categoryService;

    @GetMapping("/")
    public String AdminIndex() {
        return "admin/index";
    }

    @GetMapping("/category")
    public String Category() {
        return "admin/category";
    }

    @PostMapping("/save-category")
    public String saveCategory(@ModelAttribute categoryModel categoryModel, HttpSession session) {
        Boolean existCategory = categoryService.existCategory(categoryModel.getName());
        if (existCategory) {
            session.setAttribute("ErrorMessage", "Category Already Exist");
        } else {
            categoryModel saveCategory = categoryService.saveCategory(categoryModel);
            if (!ObjectUtils.isEmpty(saveCategory)) {
                session.setAttribute("SuccessMessage", "Category Added Successfully");
            } else {
                session.setAttribute("ErrorMessage", "Category Not Added");
            }
        }
        categoryService.saveCategory(categoryModel);
        return "redirect:/category";
    }
}