package level2.exercise1.model;



import level2.exercise1.interfaces.InputReader;

import java.util.Scanner;

public class ByteReader implements InputReader<Byte> {
    private final Scanner scanner;

    public ByteReader(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Byte read(String message) {
        for (;;) {
            try {
                System.out.print(message + ": ");
                return scanner.nextByte();
            } catch (Exception e) {
                System.out.println("Error: introdueix un número entre -128 i 127.");
            } finally {
                scanner.nextLine();
            }
        }
    }
}