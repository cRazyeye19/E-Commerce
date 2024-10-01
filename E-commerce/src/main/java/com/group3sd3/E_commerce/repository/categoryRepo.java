package com.group3sd3.E_commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group3sd3.E_commerce.model.categoryModel;
public interface categoryRepo extends JpaRepository<categoryModel, Integer> {
    public boolean existsByName(String name);
}