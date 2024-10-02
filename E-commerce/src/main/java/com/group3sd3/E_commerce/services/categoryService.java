package com.group3sd3.E_commerce.services;

import java.util.List;
import com.group3sd3.E_commerce.model.categoryModel;

public interface categoryService {
    public categoryModel saveCategory(categoryModel categoryModel);

    public Boolean existCategory(String name);

    public List<categoryModel> getAllCategory();

    public Boolean deleteCategory(int id);

    public categoryModel getCategoryById(int id);
}