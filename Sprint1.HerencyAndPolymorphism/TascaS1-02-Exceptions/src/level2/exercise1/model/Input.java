package level2.exercise1.model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        byte value = 0;
        boolean isValid = false;

        do {
            try {
                System.out.print(message + ": ");
                value = scanner.nextByte();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format. Has d'introduir un número enter petit (byte).");
            } finally {
                scanner.nextLine();
            }
        } while (!isValid);
        return value;
    }

    public static int readInt(String message) {
        int value = 0;
        boolean isValid = false;

        do {
            try {
                System.out.print(message + ": ");
                value = scanner.nextInt();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format. Has d'introduir un número enter (int).");
            } finally {
                scanner.nextLine();
            }
        } while (!isValid);

        return value;
    }

    public static float readFloat(String message) {
        double value = 0;
        boolean isValid = false;

        do {
            try {
                System.out.print(message + " (usa coma per decimals, exemple: 3,14): ");
                value = scanner.nextDouble();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format. Has d'introduir un número decimal amb punt (Exemple: 3.14)");
            } finally {
                scanner.nextLine();
            }
        } while (!isValid);

        return (float) value;
    }

    public static double readDouble(String message) {
        double value = 0;
        boolean isValid = false;

        do {
            try {
                System.out.print(message + ": ");
                value = scanner.nextDouble();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format. Has d'introduir un número decimal (amb coma).");
            } finally {
                scanner.nextLine();
            }
        } while (!isValid);

        return value;
    }

    static class InvalidCharacterException extends Exception {
        public InvalidCharacterException(String message) {
            super(message);
        }
    }

    public static char readChar(String message) {
        String input;
        char value = ' ';
        boolean isValid = false;

        do {
            try {
                System.out.print(message + ": ");
                input = scanner.nextLine();

                if (input.length() != 1) {
                    throw new InvalidCharacterException("Has d'introduir un únic caràcter.");
                }

                value = input.charAt(0);
                isValid = true;

            } catch (InvalidCharacterException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (!isValid);

        return value;
    }

    public static String readString(String message) {
        String input;
        boolean isValid = false;

        do {
            try {
                System.out.print(message + ": ");
                input = scanner.nextLine();

                if (input.trim().isEmpty()) {
                    throw new Exception("El text no pot estar buit.");
                }

                return input;

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (true);
    }

    public static boolean readYesNo(String message) {
        String input;

        do {
            try {
                System.out.print(message + " (s/n): ");
                input = scanner.nextLine().toLowerCase();
                if (input.equals("s")) {
                    return true;
                } else if (input.equals("n")) {
                    return false;
                } else {
                    throw new Exception("Has d'introduir 's' o 'n'.");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (true);
    }
}

