package com.methaporce.vista;

// Paquete com.methaporce.vista

import com.methaporce.modelo.GestorPelicula;
import com.methaporce.modelo.Pelicula;

import java.util.List;
import java.util.Scanner;

public class MainPelicula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorPelicula gestor = new GestorPelicula();

        while (true) {
            System.out.println("Opciones:");
            System.out.println("1. Agregar película");
            System.out.println("2. Eliminar película");
            System.out.println("3. Marcar película como disponible");
            System.out.println("4. Mostrar lista de películas disponibles");
            System.out.println("5. Marcar película como no disponible");
            System.out.println("6. Mostrar lista de películas no disponibles");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID de la película: ");
                    int id = scanner.nextInt();
                    System.out.print("Ingrese el nombre de la película: ");
                    scanner.nextLine();  // Consumir la línea en blanco
                    String nombre = scanner.nextLine();
                    Pelicula pelicula = new Pelicula(id, nombre);
                    gestor.agregarPelicula(pelicula);
                    System.out.println("Pelicula agregada con éxito.");
                    break;
                case 2:
                    System.out.print("Ingrese el ID de la película a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    gestor.eliminarPelicula(idEliminar);
                    System.out.println("Pelicula eliminada con éxito.");
                    break;
                case 3:
                    System.out.print("Ingrese el ID de la película a marcar como disponible: ");
                    int idDisponible = scanner.nextInt();
                    gestor.marcarPeliculaComoDisponible(idDisponible);
                    System.out.println("Pelicula marcada como disponible con éxito.");
                    break;
                case 4:
                    List<Pelicula> disponibles = gestor.obtenerPeliculasDisponibles();
                    System.out.println("Películas disponibles:");
                    for (Pelicula p : disponibles) {
                        System.out.println(p);
                    }
                    break;
                case 5:
                    System.out.print("Ingrese el ID de la película a marcar como no disponible: ");
                    int idNoDisponible = scanner.nextInt();
                    gestor.marcarPeliculaComoNoDisponible(idNoDisponible);
                    System.out.println("Pelicula marcada como no disponible con éxito.");
                    break;
                case 6:
                    List<Pelicula> noDisponibles = gestor.obtenerPeliculasNoDisponibles();
                    System.out.println("Películas no disponibles:");
                    for (Pelicula p : noDisponibles) {
                        System.out.println(p);
                    }
                    break;
                case 7:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}

