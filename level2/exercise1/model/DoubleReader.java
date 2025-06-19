package level2.exercise1.model;

import level2.exercise1.interfaces.InputReader;

import java.util.Scanner;


public class DoubleReader implements InputReader<Double> {
    private final Scanner scanner;

    public DoubleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Double read(String message) {
        for (;;) {
            try {
                System.out.print(message + " (usa coma o punt): ");
                String input = scanner.nextLine().replace(",", ".");
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Error: introdueix un número decimal vàlid.");
            }
        }
    }
}