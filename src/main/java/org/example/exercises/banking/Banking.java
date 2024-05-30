package main.java.org.example.exercises.banking;

import java.util.Scanner;

public class Banking {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = scanner.nextInt();

        System.out.print("Enter account holder: ");
        String holder = scanner.next();

        char depositState;
        do {
            System.out.print("Is there an initial deposit (y/n)? ");
            depositState = scanner.next().charAt(0);
        } while (depositState != 'y' && depositState != 'n');

        if (depositState == 'y') {
            System.out.print("Enter initial deposit amount: ");
            double initialDepositAmount = scanner.nextDouble();

            account = new Account(number, holder, initialDepositAmount);
        } else {
            account = new Account(number, holder);
        }

        System.out.println("\nAccount Data:");
        System.out.println(account.toString());

        System.out.print("Enter a deposit value: ");
        double depositValue = scanner.nextDouble();

        account.deposit(depositValue);

        System.out.println("\nUpdated Account Data:");
        System.out.println(account.toString());

        System.out.print("Enter a withdrawal value: ");
        double withdrawalValue = scanner.nextDouble();

        account.withdraw(withdrawalValue);

        System.out.println("\nUpdated Account Data:");
        System.out.println(account.toString());
    }

}
