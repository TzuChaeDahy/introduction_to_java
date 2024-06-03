package main.java.org.example.exercises.entities;

import main.java.org.example.exercises.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class OrderOperation {
    private static final DateTimeFormatter withoutTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter withTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static final Scanner scanner = new Scanner(System.in);

    public static void run() {
        System.out.println("Enter client data:");

        System.out.print("Name: ");
        String name = scanner.nextLine().trim();

        System.out.print("Email: ");
        String email = scanner.nextLine().trim();

        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDate = scanner.next().trim();

        System.out.println();

        System.out.println("Enter order data:");

        System.out.print("Status: ");
        String status = scanner.next().trim();

        System.out.print("How many items to this order? ");
        Integer quantity = scanner.nextInt();

        Order order = new Order(OrderStatus.valueOf(status), new Client(name, email, LocalDate.parse(birthDate, withoutTimeFormatter)));
        for (int i = 0; i < quantity; i++) {
            System.out.println();

            System.out.printf("Enter #%d item data: \n", i + 1);
            scanner.nextLine();

            System.out.print("Product name: ");
            String productName = scanner.nextLine().trim();

            System.out.print("Product price: ");
            Double productPrice = scanner.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.print("Product quantity: ");
            Integer productQuantity = scanner.nextInt();

            order.addItem(new OrderItem(productQuantity, product));
        }

        System.out.println("Order summary: ");
        System.out.printf("Order moment: %s\n", order.getDate().format(withTimeFormatter));
        System.out.printf("Order status: %s\n", order.getStatus());
        System.out.printf("Client: %s\n", order.getClient());
        System.out.println("Order items: ");
        for (OrderItem orderItem: order.getItems()) {
            System.out.println(orderItem);
        }

        System.out.println();

        System.out.printf("Total price: $%.2f", order.total());
    }
}
