package com.dellahi.buyAny.Model;

import javax.persistence.*;

@Entity(name = "category")
public class Category {

    @Id
    @Column(name = "category_name")
    private String categoryName;

    @Column(
            name = "description",
            nullable = false
    )
    private String description;

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Category() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                ", Description='" + description + '\'' +
                '}';
    }
}