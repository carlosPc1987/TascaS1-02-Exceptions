package level2.exercise1.model;
import level2.exercise1.interfaces.InputReader;

import java.util.Scanner;

public class IntReader implements InputReader<Integer> {
    private final Scanner scanner;

    public IntReader(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Integer read(String message) {
        for (;;) {
            try {
                System.out.print(message + ": ");
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Error: introdueix un número enter vàlid.");
            } finally {
                scanner.nextLine();
            }
        }
    }
}