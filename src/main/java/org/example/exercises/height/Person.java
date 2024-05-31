package main.java.org.example.exercises.height;

public class Person {
    private final String name;
    private final float height;
    private final byte age;

    public Person(String name, float height, byte age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public float getHeight() {
        return height;
    }

    public byte getAge() {
        return age;
    }

    public boolean isUnderSixteen() {
        return age < 16;
    }
}
