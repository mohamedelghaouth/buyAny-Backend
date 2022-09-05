package com.dellahi.buyAny.Model;

import lombok.*;

import javax.persistence.*;

@Entity(name = "category")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
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