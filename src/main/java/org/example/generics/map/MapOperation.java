package main.java.org.example.generics.map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapOperation {
    public static Scanner scanner = new Scanner(System.in);

    public static void run() {
        System.out.print("Enter file full path: ");
        String path = scanner.next();

        Map<String, Integer> candidates = new TreeMap<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while (reader.ready()) {
                String line = reader.readLine();

                String[] fields = line.split(",");
                Integer votes = Integer.parseInt(fields[1].trim());

                if (candidates.containsKey(fields[0])) {
                    candidates.put(fields[0], candidates.get(fields[0]) + votes);
                } else {
                    candidates.put(fields[0], votes);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            for (String candidateKey : candidates.keySet()) {
                System.out.printf("%s: %d\n", candidateKey, candidates.get(candidateKey));
            }
        }
    }
}

