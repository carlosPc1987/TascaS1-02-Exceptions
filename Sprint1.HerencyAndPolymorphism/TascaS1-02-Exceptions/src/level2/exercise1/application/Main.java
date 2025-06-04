package level2.exercise1.application;

import level2.exercise1.model.Input;


public class Main {
    public static void main(String[] args) {
        byte age = Input.readByte("Introdueix la teva edat");
        System.out.println("Edat introduïda: " + age);

        int number = Input.readInt("Introdueix un número enter");
        System.out.println("Número introduït: " + number);

        float decimal = Input.readFloat("Introdueix un número decimal");
        System.out.println("Decimal introduït: " + decimal);

        double doubleDecimal = Input.readDouble("Introdueix un número decimal llarg");
        System.out.println("Decimal introduït: " + doubleDecimal);

        char character = Input.readChar("Introdueix un caràcter");
        System.out.println("Caràcter introduït: " + character);

        String text = Input.readString("Introdueix un text");
        System.out.println("Text introduït: " + text);

        boolean answer = Input.readYesNo("Vols continuar?");
        System.out.println("Resposta: " + (answer ? "Sí" : "No"));
    }
}

