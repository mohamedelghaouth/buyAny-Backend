package com.dellahi.buyAny.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "item")
public class Item {

    @Id
    @Column(name = "item_id")
    private Long itemID;

    @Column(
            name = "item_name",
            nullable = false
    )
    private String itemName;

    @Column(name = "item_description")
    private String itemDescription;

    @Column(name = "price")
    private int price;

    @ManyToOne
    @JoinColumn(name = "category_name", nullable = false)
    private Category category;
}
