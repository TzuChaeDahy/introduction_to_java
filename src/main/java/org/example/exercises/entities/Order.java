package main.java.org.example.exercises.entities;

import main.java.org.example.exercises.entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private final UUID id = UUID.randomUUID();
    private final LocalDateTime date = LocalDateTime.now();
    private OrderStatus status;

    private List<OrderItem> items = new ArrayList<>();
    private Client client;

    public Order(OrderStatus status, Client client) {
        this.status = status;
        this.client = client;
    }

    public UUID getId() {
        return this.id;
    }

    public LocalDateTime getDate() {
        return this.date;
    }

    public OrderStatus getStatus() {
        return this.status;
    }

    public Client getClient() {
        return this.client;
    }

    public List<OrderItem> getItems() {
        return this.items;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item) {
        this.items.add(item);
    }

    public void removeItem(OrderItem item) {
        this.items.remove(item);
    }

    public Double total() {
        Double sum = 0.0;
        for (OrderItem item : this.items) {
            sum += item.subTotal();
        }

        return sum;
    }
}
