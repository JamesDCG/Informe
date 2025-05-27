/* Integrantes: 
Columba James
Peralta Jean */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel(6); // Hotel con 6 habitaciones

        int opcion;
        do {
            System.out.println("\n--- Gestión de Hotel ---");
            System.out.println("1. Crear nueva reserva");
            System.out.println("2. Consultar disponibilidad");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese nombre del cliente: ");
                    String nombre = sc.nextLine();
                    Reserva r = hotel.crearReserva(nombre);
                    if (r != null) {
                        System.out.println("Reserva creada: " + r);
                    } else {
                        System.out.println("No hay habitaciones disponibles.");
                    }
                }
                case 2 -> hotel.mostrarEstadoHabitaciones();
                case 3 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 3);
    }
}
