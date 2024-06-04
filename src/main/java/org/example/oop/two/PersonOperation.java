package main.java.org.example.oop.two;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonOperation {
    private static Scanner scanner = new Scanner(System.in);

    public static void run() {
        System.out.print("Enter the number of tax payers: ");
        int n = scanner.nextInt();

        List<Person> peopleList = new ArrayList<Person>();
        for (int i = 0; i < n; i++) {
            System.out.printf("Tax payer #%d data: \n", i + 1);

            System.out.print("Natural or Legal person (n/l)? ");
            char person = scanner.next().charAt(0);

            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Annual Revenue: ");
            double revenue = scanner.nextDouble();

            if (person == 'n') {
                System.out.print("Health Expenditures: ");
                double healthExpenditures = scanner.nextDouble();

                peopleList.add(new NaturalPerson(name, revenue, healthExpenditures));
            } else if (person == 'l') {
                System.out.print("Number of Employees: ");
                int numOfEmployees = scanner.nextInt();

                peopleList.add(new LegalPerson(name, revenue, numOfEmployees));
            }
        }

        System.out.println();

        System.out.println("Taxes paid:");
        double totalTaxes = 0.0;
        for (Person person : peopleList) {
            totalTaxes += person.calculateTaxes();
            System.out.println(person);
        }
        System.out.println();

        System.out.printf("Total taxes: $ %.2f\n", totalTaxes);
    }
}
