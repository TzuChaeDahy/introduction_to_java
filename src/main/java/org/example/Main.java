package org.example;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        firstExercise();
    }

    private static String capitalizeFirstLetter(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    private static void printProductAndPrice(String product, float price) {
        System.out.printf("%s, which price is $ %.2f\n", capitalizeFirstLetter(product), price);
    }

    private static void firstExercise() {
        String productOne = "computer";
        String productTwo = "office desk";

        byte age = 30;
        short code = 5290;
        char gender = 'F';

        float priceOne = 2100.0f;
        float priceTwo = 650.50f;
        float measure = 53.234567f;

        Locale.setDefault(Locale.FRANCE);

        System.out.println(capitalizeFirstLetter("products: "));
        printProductAndPrice(productOne, priceOne);
        printProductAndPrice(productTwo, priceTwo);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %c\n", age, code, gender);
        System.out.println();
        System.out.printf("Measure with eight decimal places: %.8f\n", measure);
        System.out.printf("Rounded (three decimal places): %.3f\n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f\n", measure);
    }
}