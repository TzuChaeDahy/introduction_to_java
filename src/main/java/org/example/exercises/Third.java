package main.java.org.example.exercises;

import java.util.Scanner;

public class Third {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        float dollarPrice = scanner.nextFloat();

        System.out.print("How many dollars will be bought? ");
        float amountDollar = scanner.nextFloat();

        float amountReal = amountDollar * dollarPrice * 1.06f;

        System.out.printf("Amount to be paid in reais: %.2f", amountReal);
    }
}
