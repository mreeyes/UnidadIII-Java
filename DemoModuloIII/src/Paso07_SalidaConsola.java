/**
 *  Diapositiva 18 (SALIDA EN CONSOLA)
 * print, println, \n y la concatenación.
 */
public class Paso07_SalidaConsola {
    public static void main(String[] args) {
        String nombre = "Ana";
        int edad = 20;

        System.out.println("Hola, mundo");     // imprime y salta de línea
        System.out.print("Nombre: ");          // imprime SIN saltar
        System.out.println(nombre);            // queda en la misma línea: Nombre: Ana
        System.out.println("Edad: " + edad);   // + une texto y valores

        System.out.println("Línea 1\nLínea 2");   // \n también salta de línea

        // ¿qué imprime cada línea?
        System.out.println("Suma: " + 2 + 3);
        System.out.println("Suma: " + (2 + 3));
    }
}
