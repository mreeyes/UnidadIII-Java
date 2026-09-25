/**
 * PASO 5 - Diapositivas 10 y 11 (SOBRECARGA DE MÉTODOS)
 * Imprime en consola qué versión de sumar() usó cada llamada.
 */
public class Paso05_SobrecargaMetodos {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.sumar(2, 3));         // (int, int)
        System.out.println(calc.sumar(2, 3, 4));      // (int, int, int)
        System.out.println(calc.sumar(2.5, 1.5));     // (double, double)
        System.out.println(calc.sumar(2, 3.5));       // pregunta: ¿cuál usa? -> (double, double)

        // println también está sobrecargado, tal como acaban de ver con sumar():
        System.out.println(5);
        System.out.println(9.5);
        System.out.println("Hola");
        System.out.println(true);
    }
}
