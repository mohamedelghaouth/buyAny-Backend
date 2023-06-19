package com.dellahi.buyAny.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
}