package com.group3sd3.E_commerce.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.group3sd3.E_commerce.model.categoryModel;
import com.group3sd3.E_commerce.repository.categoryRepo;
import com.group3sd3.E_commerce.services.categoryService;

@Service
public class categoryImpl implements categoryService {

    @Autowired
    private categoryRepo categoryRepo;

    @Override
    public categoryModel saveCategory(categoryModel categoryModel) {
        return categoryRepo.save(categoryModel);
    }

    @Override
    public List<categoryModel> getAllCategory() {
        return categoryRepo.findAll();
    }

    @Override
    public Boolean existCategory(String name) {
        return categoryRepo.existsByName(name);
    }

    @Override
    public Boolean deleteCategory(int id) {
        categoryModel categoryModel = categoryRepo.findById(id).orElse(null);

        if (!ObjectUtils.isEmpty(categoryModel)) {
            categoryRepo.delete(categoryModel);
            return true;
        }
        return false;
    }

    @Override
    public categoryModel getCategoryById(int id) {
        categoryModel categoryModel = categoryRepo.findById(id).orElse(null);
        return categoryModel;
    }
}
