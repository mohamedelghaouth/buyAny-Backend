package com.dellahi.buyAny.Services;

import com.dellahi.buyAny.Model.Category;

import java.util.List;

public interface CategoryService {
    Category saveCategory(Category category);
    Category updateCategory(Category category);
    void deleteCategory(Category category);
    void deleteCategoryByName(String categoryName);
    Category getCategory(String categoryName);
    List<Category> getAllCategories();
}
