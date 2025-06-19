package level2.exercise1.model;
import level2.exercise1.interfaces.InputReader;
import java.util.Scanner;

public class CharReader implements InputReader<Character> {
    private final Scanner scanner;

    public CharReader(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Character read(String message) {
        for (;;) {
            System.out.print(message + ": ");
            String input = scanner.nextLine();
            if (input.length() == 1) {
                return input.charAt(0);
            }
            System.out.println("Error: introdueix només un caràcter.");
        }
    }
}