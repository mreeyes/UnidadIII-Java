/**
 * ¿Qué pasa si no escribimos ningún constructor?
 *
 "¿qué creen que imprime esto?"
 */
public class Paso01_SinConstructor {
    public static void main(String[] args) {
        EstudianteV1 est1 = new EstudianteV1();   // usa el constructor invisible de Java
        est1.mostrarInfo();                       // Nombre: null / Promedio: 0.0
    }
}
