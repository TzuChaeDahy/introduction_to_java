package main.java.org.example.exercises.negative;

import java.util.Scanner;

public class Negative {
    private static final Scanner scanner = new Scanner(System.in);
    private static void writeItemsInArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print("Digite um numero: ");
            int number = scanner.nextInt();

            array[i] = number;
        }
    }

    private static void printNegativeValues(int[] array) {
        System.out.println("Numeros Negativos: ");
        for(int number: array) {
            if(number < 0) {
                System.out.println(number);
            }
        }
    }

    public static void run() {
        System.out.print("Quantos numeros voce vai digitar? ");
        byte arraySize = scanner.nextByte();

        int[] numbers = new int[arraySize];

        writeItemsInArray(numbers);

        printNegativeValues(numbers);
    }
}
