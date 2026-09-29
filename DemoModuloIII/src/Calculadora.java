/**
 * (diapositivas 10 y 11): SOBRECARGA DE MÉTODOS
 * usamos el mismo nombre (sumar), y este realiza distintas acciones de la lista dependiendo de los parámetros.
 */
public class Calculadora {

    // Versión 1: dos enteros
        // si cambiamos la firma, dara error (tipo de dato diferente)
    public int sumar(int a, int b) {
        System.out.println("  se usa sumar(int, int)");
        return a + b;
    }

    // Versión 2: distinta CANTIDAD de parámetros
    public int sumar(int a, int b, int c) {
        System.out.println("   se usa sumar(int, int, int)");
        return a + b + c;
    }

    // Versión 3: distinto TIPO de parámetros
    public double sumar(double a, double b) {
        System.out.println("  se usa sumar(double, double)");
        return a + b;
    }

    // veremos error tambien si solo cambiamos los nombres de los parámetros.
    //
    // public int sumar(int x, int y) {
    //     return x + y;
    // }
    // ---------------------------------------------------------------
}
