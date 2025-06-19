package level2.exercise1.model;

import level2.exercise1.interfaces.InputReader;

import java.util.Scanner;

public class StringReader implements InputReader<String> {
    private final Scanner scanner;

    public StringReader(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String read(String message) {
        for (;;) {
            System.out.print(message + ": ");
            String input = scanner.nextLine();
            if (!input.trim().isEmpty()) {
                return input;
            }
            System.out.println("Error: el text no pot estar buit.");
        }
    }
}
