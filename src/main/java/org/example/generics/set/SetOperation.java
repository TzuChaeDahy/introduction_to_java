package main.java.org.example.generics.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOperation {
    public static Scanner scanner = new Scanner(System.in);

    public static void run() {
        Set<Integer> students = new HashSet<>();

        for (char character = 'A'; character <= 'C'; character++) {
            System.out.printf("How many students for course %s:", character);
            int n = scanner.nextInt();

            for (int j = 0; j < n; j++) {
                students.add(scanner.nextInt());
            }
        }

        System.out.printf("Total students: %d", students.size());
    }
}

