package level1.exercise3.model;

import java.io.*;
import java.util.*;


public class RunMain {
    private Map<String, String> countryCapitalMap = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        readFile();
        playGame();

    }

    private void readFile() {
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("level1/exercise3/application/countries.txt")) {
            if (inputStream == null) {
                System.out.println("Error: Archivo no encontrado dentro del classpath.");
                return;
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    countryCapitalMap.put(parts[0], parts[1]);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }


    }

    private void playGame() {
        System.out.print("Introdueix el teu nom: ");
        String userName = scanner.nextLine();
        int score = 0;

        List<String> countries = new ArrayList<>(countryCapitalMap.keySet());
        Collections.shuffle(countries); // Mescla els països per fer-ho aleatori

        for (int i = 0; i < 10; i++) {
            String country = countries.get(i);
            System.out.print("Quina és la capital de " + country + "? ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase(countryCapitalMap.get(country))) {
                System.out.println("Correcte!");
                score++;
            } else {
                System.out.println("Incorrecte! La capital és: " + countryCapitalMap.get(country));
            }
        }

        saveScoreToFile(userName, score);
    }

    private void saveScoreToFile(String userName, int score) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("classificacio.txt", true))) {
            writer.write(userName + ": " + score + " punts\n");
        } catch (IOException e) {
            System.out.println("Error al guardar la classificació: " + e.getMessage());
        }
    }
}

