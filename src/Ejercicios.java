

import java.util.Random;
import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {
        // String saludo = "Hola, mi nombre es ";
        // String nombre= "Alicia ";
        // String continuacion = "y mi edad es ";
        // int edad = 17;
        // System.out.println(saludo + nombre + continuacion + edad);

        // // Grados Celsius a Fahrenheit

        // int celcius = 32;
        // double fahrenheit = (celcius * 1.8) + 32;
        // System.out.printf("De %d Greados Celcios a Fahrenheit son: %.2f Grados Fahrenheit", celcius, fahrenheit);


        // int contador = 1;

        // // while(contador <= 10) {
        // //     System.out.println(contador);
        // // }

        // int contador1 = 0;

        // while(contador1 <= 10) {
        //     System.out.println(contador1);
        //     contador1++;
        // }

        // Crear un objeto Random para generar números aleatorios
        Random random = new Random();
        // Generar un número aleatorio entre 0 y 100
        int numeroSecreto = random.nextInt(101); // nextInt(101) genera un número entre 0 y 100
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Variable para contar los intentos
        int intentos = 0;
        // Variable para almacenar el número ingresado por el usuario
        int numeroIngresado;
        // Variable para controlar si el usuario ha adivinado el número
        boolean adivinado = false;

        // Bucle para permitir hasta 5 intentos
        while (intentos < 5) {
            // Incrementar el contador de intentos
            intentos++;
            // Pedir al usuario que ingrese un número
            System.out.print("Intento " + intentos + ": Ingresa un número entre 0 y 100: ");
            numeroIngresado = scanner.nextInt();

            // Verificar si el número ingresado es mayor, menor o igual al número secreto
            if (numeroIngresado < numeroSecreto) {
                System.out.println("El número ingresado es mayor que el número secreto.");
            } else if (numeroIngresado > numeroSecreto) {
                System.out.println("El número ingresado es menor que el número secreto.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número secreto.");
                adivinado = true;
                break; // Salir del bucle ya que el usuario ha adivinado el número
            }
        }

        // Si el usuario no ha adivinado el número después de 5 intentos
        if (!adivinado) {
            System.out.println("Lo siento, no has adivinado el número secreto. Era: " + numeroSecreto);
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

