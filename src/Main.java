public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenid@ a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento= 1999;
        boolean incluidoEnElPlan = true;
        double calificacionPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        String sinopsis = """
                Matrix es una paradoja
                La mejor pelicula del fin del milenio
                Fue lanzada en:""" + " " + fechaDeLanzamiento;

        System.out.println(sinopsis);

        int calificacionPeliculaEstrella = (int) (media / 2); // casting explícito
        System.out.println(calificacionPeliculaEstrella);

        double calificacionMedia = calificacionPeliculaEstrella;  // casting implícito
        System.out.println(calificacionMedia);
    }
}
