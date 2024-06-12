package main.java.org.example.generics.par;

public class ParOperation {
    public static void run() {
        Par<String, Integer> aluno = new Par<>("Vinicius", 8);

        System.out.println(aluno);
    }
}
