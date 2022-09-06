package com.dellahi.buyAny.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

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