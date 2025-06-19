
package level2.exercise1.model;

import level2.exercise1.interfaces.InputReader;

import java.util.Scanner;

public class YesNoReader implements InputReader<Boolean> {
    private final Scanner scanner;

    public YesNoReader(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Boolean read(String message) {
        for (;;) {
            System.out.print(message + " (s/n): ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("s")) return true;
            if (input.equals("n")) return false;
            System.out.println("Error: introdueix 's' per sí o 'n' per no.");
        }
    }
}