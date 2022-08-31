package com.dellahi.buyAny.Model;

import javax.persistence.*;

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

    public Item() {
    }

    @Column(name = "price")
    private int price;

    @ManyToOne
    @JoinColumn(name = "category_name", nullable = false)
    private Category category;

    public Item(Long itemID, String itemName, int price, Category category) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.price = price;
        this.category = category;
    }

    public Long getItemID() {
        return itemID;
    }

    public void setItemID(Long itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemID=" + itemID +
                ", itemName='" + itemName + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
