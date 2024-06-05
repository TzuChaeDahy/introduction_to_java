package main.java.org.example.oop.three;

import main.java.org.example.oop.three.model.entities.Account;
import main.java.org.example.oop.three.model.exceptions.AccountException;

import java.util.Scanner;

public class AccountOperation {
    private static Scanner scanner = new Scanner(System.in);

    public static void run() {
        try {
            System.out.println("Enter account data");

            System.out.print("Number: ");
            int number = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Holder: ");
            String holder = scanner.nextLine();

            System.out.print("Initial balance: ");
            double initialBalance = scanner.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = scanner.nextDouble();

            Account account = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.println();

            System.out.print("Enter amount for deposit: ");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);

            System.out.print("Enter amount for withdraw: ");
            double withdrawAmount = scanner.nextDouble();
            account.withdraw(withdrawAmount);

            System.out.printf("New balance: %.2f", account.getBalance());
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
