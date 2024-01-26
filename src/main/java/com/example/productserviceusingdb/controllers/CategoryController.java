package com.example.productserviceusingdb.controllers;

import com.example.productserviceusingdb.models.Category;
import com.example.productserviceusingdb.services.CategoryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    private  final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @PostMapping
    public Category create(@RequestBody Category category){
        return  categoryService.create(category);
    }
}
