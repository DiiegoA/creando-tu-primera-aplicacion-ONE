
import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota = 0;
        double mediaEvaluationes = 0;
        double totalEvaluaciones = 0;

        while (nota != -1) {
            System.out.print("Escribe la calificacion que le darias a la pelicula Matrix (0 al 10): ");
            nota = scanner.nextDouble();

            if (nota != -1) {
                mediaEvaluationes += nota;
                totalEvaluaciones++;
            }            
        }
        System.out.printf("La media de evaluaciones para Matrix es: %.2f",(mediaEvaluationes / totalEvaluaciones));
    }
}
