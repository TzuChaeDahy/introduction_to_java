package main.java.org.example.exercises.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Client {
    private static final DateTimeFormatter withoutTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private final UUID id = UUID.randomUUID();
    private final String name;
    private final String email;
    private final LocalDate birthDate;

    public Client(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) - %s", this.getName(), this.getBirthDate().format(withoutTimeFormatter), this.getEmail());
    }
}
