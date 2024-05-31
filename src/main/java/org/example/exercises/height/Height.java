package main.java.org.example.exercises.height;

import java.util.Scanner;

public class Height {
    private static final Scanner scanner = new Scanner(System.in);

    private static Person[] getPersonData(int n) {
        Person[] people = new Person[n];

        for (int i = 0; i < people.length; i++) {
            System.out.println("Dados da " + (i + 1) + " pessoa: ");

            System.out.print("Nome: ");
            String name = scanner.next();

            System.out.print("Idade: ");
            byte age = scanner.nextByte();

            System.out.print("Altura: ");
            float height = scanner.nextFloat();

            Person person = new Person(name, height, age);
            people[i] = person;
        }

        return people;
    }

    private static float getAverageHeight(Person[] people) {
        float sum = 0;
        for(Person person : people) {
            sum += person.getHeight();
        }

        return sum / people.length;
    }

    private static float getLessThanSixteenYearsPercentage(Person[] people) {
        float sum = 0;
        for(Person person : people) {
            if (person.isUnderSixteen()) {
                sum += 1;
            }
        }

        return sum / people.length;
    }

    private static void printLestThanSixteenYearsNames(Person[] people) {
        for(Person person : people) {
            if (person.isUnderSixteen()) {
                System.out.println(person.getName());
            }
        }
    }

    public static void run() {
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = scanner.nextInt();

        Person[] people = getPersonData(n);

        float averageHeight = getAverageHeight(people);
        float lessThanSixteenPercentage = getLessThanSixteenYearsPercentage(people) * 100;

        System.out.printf("Altura Media: %.2f\n", averageHeight);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", lessThanSixteenPercentage);

        printLestThanSixteenYearsNames(people);
    }
}
