package com.dellahi.buyAny.Services.Impl;

import com.dellahi.buyAny.Model.Category;
import com.dellahi.buyAny.Repository.CategoryRepository;
import com.dellahi.buyAny.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(Category category) {
        categoryRepository.delete(category);
    }

    @Override
    public void deleteCategoryByName(String categoryName) {
        categoryRepository.deleteById(categoryName);
    }

    @Override
    public Category getCategory(String categoryName) {
        return categoryRepository.findById(categoryName).get();
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
