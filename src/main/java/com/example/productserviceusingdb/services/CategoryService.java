package com.example.productserviceusingdb.services;

import com.example.productserviceusingdb.models.Category;
import com.example.productserviceusingdb.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    public Category create(Category category){
       return categoryRepository.save(category);
    }
}
