/**
 * PASO 5 (diapositivas 10 y 11): SOBRECARGA DE MÉTODOS
 * Mismo nombre (sumar), distinta lista de parámetros.
 */
public class Calculadora {

    // Versión 1: dos enteros
    public int sumar(int a, int b) {
        System.out.println("   -> usó sumar(int, int)");
        return a + b;
    }

    // Versión 2: distinta CANTIDAD de parámetros
    public int sumar(int a, int b, int c) {
        System.out.println("   -> usó sumar(int, int, int)");
        return a + b + c;
    }

    // Versión 3: distinto TIPO de parámetros
    public double sumar(double a, double b) {
        System.out.println("   -> usó sumar(double, double)");
        return a + b;
    }

    // ---------------------------------------------------------------
    // DEMO diapositiva 11: descomenta esto y verás el ERROR.
    // Solo cambia el tipo de retorno -> misma firma que la versión 1.
    //
    // public double sumar(int a, int b) {
    //     return a + b;
    // }
    //
    // También da error: solo cambian los NOMBRES de los parámetros.
    //
    // public int sumar(int x, int y) {
    //     return x + y;
    // }
    // ---------------------------------------------------------------
}
