package main.java.org.example;

import main.java.org.example.exercises.First;
import main.java.org.example.exercises.Second;
import main.java.org.example.exercises.Third;
import main.java.org.example.exercises.banking.Banking;
import main.java.org.example.exercises.entities.OrderOperation;
import main.java.org.example.exercises.height.Height;
import main.java.org.example.exercises.negative.Negative;
import main.java.org.example.oop.one.entities.EmployeeOperation;
import main.java.org.example.oop.three.AccountOperation;
import main.java.org.example.oop.two.PersonOperation;

public class Main {
    public static void main(String[] args) {
        First.run();
        Second.run();
        Third.run();
        Banking.run();
        Negative.run();
        Height.run();
        OrderOperation.run();
        EmployeeOperation.run();
        PersonOperation.run();
        AccountOperation.run();
    }
}