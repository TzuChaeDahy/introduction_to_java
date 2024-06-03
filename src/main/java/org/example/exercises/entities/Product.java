package main.java.org.example.exercises.entities;

import java.util.UUID;

public class Product {
    private final UUID id = UUID.randomUUID();
    private final String name;
    private final Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public UUID getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }
}
