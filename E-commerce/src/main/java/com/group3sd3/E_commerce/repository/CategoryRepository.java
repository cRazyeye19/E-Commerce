package com.group3sd3.E_commerce.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import com.group3sd3.E_commerce.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    public Boolean existsByName(String name);
    
    @NonNull
    Page<Category> findAll(@NonNull Pageable pageable);
}
