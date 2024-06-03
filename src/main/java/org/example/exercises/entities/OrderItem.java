package main.java.org.example.exercises.entities;

import java.util.UUID;

public class OrderItem {
    private final UUID id = UUID.randomUUID();
    private final Integer quantity;
    private final Product product;

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public Double subTotal() {
        return this.product.getPrice() * this.quantity;
    }

    @Override
    public String toString() {
        return String.format("%s, $%.2f, Quantity: %d, Subtotal: $%.2f", product.getName(), product.getPrice(), this.quantity, this.subTotal());
    }
}
