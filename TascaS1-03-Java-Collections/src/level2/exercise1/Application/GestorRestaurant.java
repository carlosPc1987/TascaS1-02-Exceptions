package level2.exercise1.Application;

import level2.exercise1.Model.Restaurant;

import java.util.HashSet;
import java.util.Scanner;

class GestorRestaurantes implements Runnable {
    private HashSet<Restaurant> restaurants = new HashSet<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        System.out.println("Introduce restaurantes (nombre y puntuación). Escribe 'salir' para terminar.");

        while (true) {
            System.out.print("Nombre del restaurante: ");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("salir")) break;

            System.out.print("Puntuación: ");
            int puntuacion;
            try {
                puntuacion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un número válido.");
                continue;
            }

            Restaurant nuevoRestaurante = new Restaurant(nombre, puntuacion);
            if (restaurants.add(nuevoRestaurante)) {
                System.out.println("Restaurante agregado.");
            } else {
                System.out.println("Este restaurante con la misma puntuación ya existe, no se añadirá.");
            }
        }

        mostrarRestaurantes();
    }


    private void mostrarRestaurantes() {
        System.out.println("\nLista de restaurantes únicos:");
        for (Restaurant r : restaurants) {
            System.out.println(r);
        }
    }
}


