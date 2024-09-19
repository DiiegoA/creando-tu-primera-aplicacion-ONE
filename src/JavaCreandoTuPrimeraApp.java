import java.util.Scanner;

public class JavaCreandoTuPrimeraApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar información del cliente
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        
        System.out.print("Ingrese el tipo de cuenta (Ahorros o Corriente): ");
        String tipoCuenta = scanner.nextLine();
        
        System.out.print("Ingrese el saldo inicial: $");
        double saldo = scanner.nextDouble();

        // Imprimir los datos de cliente
        System.out.printf("""
            \nNombre del cliente: %s
            Tipo de cuenta: %s
            Saldo inicial: $%.2f
            """, nombreCliente, tipoCuenta, saldo);
        
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("""
                \n*** Escriba el número de la opción deseada ***
                \n--- Menú ---
                1. Consultar saldo
                2. Retirar dinero
                3. Depositar dinero
                9. Salir
                """);
            
            // Leer la opción del usuario
            opcion = scanner.nextInt();
            
            // Mostrar mensaje de opción seleccionada
            switch (opcion) {
                // Consultar saldo
                case 1 -> {
                    System.out.println("\nSeleccionaste: Consultar saldo");
                    System.out.printf("El saldo actual es: $%.2f%n", saldo);
                }
                
                // Retirar dinero
                case 2 -> {
                    System.out.println("\nSeleccionaste: Retirar dinero");
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetiro = scanner.nextDouble();
                    if (cantidadRetiro > saldo) {
                        System.out.println("Fondos insuficientes.");
                    } else {
                        saldo -= cantidadRetiro;
                        System.out.printf("Has retirado: $%.2f%n", cantidadRetiro);
                    }
                }
                
                // Depositar dinero
                case 3 -> {
                    System.out.println("\nSeleccionaste: Depositar dinero");
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double cantidadDeposito = scanner.nextDouble();
                    saldo += cantidadDeposito;
                    System.out.printf("Has depositado: $%.2f%n", cantidadDeposito);
                }
                
                // Salir
                case 9 -> System.out.println("Saliendo del programa...");
                
                default -> System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 9); // Continuar hasta que el usuario elija salir
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}
