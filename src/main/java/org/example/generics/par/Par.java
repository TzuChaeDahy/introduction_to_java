package main.java.org.example.generics.par;

public class Par<T, S> {
    private final T firstItem;
    private final S secondItem;

    public Par(T firstItem, S secondItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", firstItem, secondItem);
    }
}
