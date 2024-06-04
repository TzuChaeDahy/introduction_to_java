package main.java.org.example.oop.one.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeOperation {
    private static Scanner scanner = new Scanner(System.in);

    public static void run() {
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        System.out.println();

        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d data\n:", i + 1);
            System.out.print("Outsourced (y/n)? ");
            char input = scanner.next().charAt(0);

            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Hours: ");
            int hours = scanner.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();

            if (input == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = scanner.nextDouble();

                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else if (input == 'n') {
                employees.add(new Employee(name, hours, valuePerHour));
            } else {
                return;
            }
        }

        System.out.println();

        System.out.println("Payments:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
