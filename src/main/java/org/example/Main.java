package main.java.org.example;

import main.java.org.example.exercises.First;
import main.java.org.example.exercises.Second;
import main.java.org.example.exercises.Third;
import main.java.org.example.exercises.banking.Banking;
import main.java.org.example.exercises.height.Height;
import main.java.org.example.exercises.negative.Negative;

public class Main {
    public static void main(String[] args) {
        First.run();
        Second.run();
        Third.run();
        Banking.run();
        Negative.run();
        Height.run();
    }
}