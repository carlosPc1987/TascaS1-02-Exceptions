package level2.exercise1.model;

import level2.exercise1.interfaces.InputReader;

import java.util.Scanner;


public class FloatReader implements InputReader<Float> {
    private final Scanner scanner;

    public FloatReader(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Float read(String message) {
        for (; ; ) {
            try {
                System.out.print(message + " (usa coma o punt): ");
                String input = scanner.nextLine().replace(",", ".");
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println("Error: introdueix un número decimal vàlid.");
            }
        }
    }
}