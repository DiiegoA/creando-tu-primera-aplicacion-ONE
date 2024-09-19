public class Apuntes {
    public static void main(String[] args) {
        /*  Las diferencias entre JVM, JRE y JDK:
        JVM (Java Virtual Machine): es la Máquina Virtual de Java responsable de ejecutar el bytecode.
        JRE (Java Runtime Environment): es el Entorno de Ejecución de Java que proporciona las bibliotecas estándar de Java para que el JDK compile tu código y para que JVM ejecute tu programa.
        JDK (Java Development Kit): es el Kit de Desarrollo de Java responsable de compilar el código fuente en bytecode.
        
        byte:
        El tipo byte se utiliza para representar valores numéricos enteros de 8 bits. Tiene un rango de valores de -128 a 127.

        char:
        El tipo char se utiliza para representar caracteres individuales. Puede almacenar cualquier carácter Unicode y se representa con comillas simples ('').

        short:
        El tipo short se utiliza para representar valores numéricos enteros de 16 bits. Tiene un rango de valores de -32.768 a 32.767.

        int:
        El tipo int se utiliza para representar valores numéricos enteros de 32 bits. Es uno de los tipos de datos más utilizados para representar números enteros en Java y tiene un rango de valores de -2.147.483.648 a 2.147.483.647.

        long:
        El tipo long se utiliza para representar valores numéricos enteros de 64 bits. Se utiliza para representar valores enteros muy grandes y tiene un rango de valores de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807.

        float:
        El tipo float se utiliza para representar valores numéricos de punto flotante, es decir, valores con decimales. Ocupa 32 bits de memoria. Puede representar números decimales con hasta siete dígitos y tiene una precisión limitada, lo que significa que puede redondear los números si son demasiado grandes o demasiado pequeños.

        double:
        El tipo double es similar al float, pero ocupa 64 bits de memoria y puede representar números decimales con hasta quince dígitos.
        */

        int valor =  10; 
        valor += 15;  //Equivalente al valor = valor + 15, atribuye el valor 15 a la variable valor

        int num = 5;
        int resultado = ++num; //num es incrementado para 6 e después es atribuido al resultado
        System.out.println(num); // imprime 6
        System.out.println(resultado); // imprime 6

        String contrasena= "12345";

        if (contrasena.equals("12345")) {
            System.out.println("Acceso autorizado!");
        } else {
            System.out.println("Contraseña incorrecta.");
        }

        String nombre = "Maria";
        int edad = 30;
        double valor1 = 55.9999;
        System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre, edad, valor1));

        int x = 10;
        double y = x; // casting implícito
        System.out.println(y);

        double a = 10.5;
        int b = (int) a; // casting explícito
        System.out.println(b);
    }
}
