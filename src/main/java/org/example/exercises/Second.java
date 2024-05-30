package main.java.org.example.exercises;

import java.util.Scanner;

public class Second {
    private static float askUserForCelsiusTemperature(Scanner scanner) {
        System.out.println("Enter temperature in celsius: ");

        return scanner.nextFloat();
    }

    private static float convertCelsiusToFahrenheit(float celsiusTemperature) {
        return celsiusTemperature * 9 / 5 + 32;
    }

    private static boolean askUserForRepeatingProcess(Scanner scanner) {
        System.out.println("You wish to convert again? (y/n): ");
        char response = scanner.next().toLowerCase().charAt(0);

        return response == 'y';
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        do {
            float fahrenheit = convertCelsiusToFahrenheit(askUserForCelsiusTemperature(scanner));
            System.out.printf("Temperature in fahrenheit: %.1f\n", fahrenheit);
            repeat = askUserForRepeatingProcess(scanner);
        } while (repeat);

        scanner.close();
    }
}
