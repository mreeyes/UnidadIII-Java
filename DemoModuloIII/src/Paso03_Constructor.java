/**
 *  Diapositivas 4 a 9 (CONSTRUCTORES)
 * observemos como  en consola el mensaje muestra "se ejecuto el constructor"
 *
 *  diapositiva 9: si comentamos  el constructor vacío dentro de la clase Estudiante.java
 * y la línea de new Estudiante() de aquí abajo, veremos como dará error de compilación.
 */
public class Paso03_Constructor {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Ana", 9.5);   // nace desde el principio con datos
        est1.mostrarInfo();

        System.out.println("---");
        Estudiante est2 = new Estudiante();              // usara el constructor vacío
        est2.mostrarInfo();                              // "Sin nombre", 0.0
    }
}
