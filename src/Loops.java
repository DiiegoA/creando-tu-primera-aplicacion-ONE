
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota = 0;
        double mediaEvaluationes = 0;

        // For loop
        for (int i = 0; i < 5; i++) {
            System.out.print("Escribe la calificacion que le darias a la pelicula Matrix (0 al 10): ");
            nota = scanner.nextDouble();
            mediaEvaluationes += nota;
        }
        System.out.printf("La media de evaluaciones para Matrix es: %.2f",(mediaEvaluationes / 5));
    }
}
