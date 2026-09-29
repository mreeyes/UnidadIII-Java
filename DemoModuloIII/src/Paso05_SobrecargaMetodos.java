/**
 * Diapositivas 10 y 11 (SOBRECARGA DE MÉTODOS)
 * va a imprimir en consola qué versión de sumar() usó cada llamada.
 */
public class Paso05_SobrecargaMetodos {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.sumar(2, 3));         // (int, int)
        System.out.println(calc.sumar(2, 3, 4));      // (int, int, int)
        System.out.println(calc.sumar(2.5, 1.5));     // (double, double)
        System.out.println(calc.sumar(2, 3.5));       //¿cuál usa?

    }
}
