import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe el nombre de tu pelicula favorita: ");
        String pelicula = scanner.nextLine();

        System.out.print("Ahora escribe la fecha de lanzamiento: ");
        int fechaDeLanzamiento = scanner.nextInt();

        System.out.print("Por ultimo que nota le das a esta pelicula (0 al 10): ");
        // Lee la calificación como texto para poder procesar tanto coma como punto decimal
        String calificacionInput = scanner.next().replace(',', '.');
        
        // Convertir el string con el separador modificado a double
        double calificacionPelicula = Double.parseDouble(calificacionInput);

        System.out.println("Película: " + pelicula);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Calificación: " + calificacionPelicula);
    }
}
