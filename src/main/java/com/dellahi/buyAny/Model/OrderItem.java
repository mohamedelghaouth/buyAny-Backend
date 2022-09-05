package com.dellahi.buyAny.Model;

import lombok.*;

import javax.persistence.*;

@Entity(name="order_item")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class OrderItem {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_item_seq")
    @SequenceGenerator(name = "order_item_seq", sequenceName = "order_item_seq", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_number", nullable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "item_id", nullable = false)
    private Item item;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Transient
    private int totalPrice;

    public OrderItem(Order order, Item item, int quantity) {
        this.order = order;
        this.item = item;
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return this.quantity*this.item.getPrice();
    }
}
