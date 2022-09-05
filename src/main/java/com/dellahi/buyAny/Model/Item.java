package com.dellahi.buyAny.Model;

import lombok.*;

import javax.persistence.*;

@Entity(name = "item")
@Getter
@Setter
@NoArgsConstructor
@ToString
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

    public Item(String itemName, int price, Category category) {
        this.itemName = itemName;
        this.price = price;
        this.category = category;
    }
}
