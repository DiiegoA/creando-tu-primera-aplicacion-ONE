public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento= 1999;
        boolean incluidoEnElPlan = false;
        double calificacionPelicula = 8.2;
        String plan = "Plus";

        if (fechaDeLanzamiento >= 2022){
            System.out.println("Peliculas más populares");
        } else{
            System.out.println("Peliculas retro que aun valen la pena ver");
        }

        if (incluidoEnElPlan || plan.equals("Plus")) {
            System.out.println("Disfrute de su plan");
        } else{
            System.out.println("Pelicula no disponible para su plan actual");
        }


        if (incluidoEnElPlan && plan.equals("Plus")) {
            System.out.println("Disfrute de su plan");
        } else{
            System.out.println("Pelicula no disponible para su plan actual");
        }
    }
}
