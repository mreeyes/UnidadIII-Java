/**
 *  Diapositivas 4 a 9 (CONSTRUCTORES)
 *
 *  diapositiva 9: recordar comentar el constructor vacío dentro de Estudiante.java
 * y la línea de "new Estudiante()" de aquí abajo dará error de compilación.
 */
public class Paso03_Constructor {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Ana", 9.5);   // nace YA con datos
        est1.mostrarInfo();

        System.out.println("---");
        Estudiante est2 = new Estudiante();              // se esta usando el constructor vacío
        est2.mostrarInfo();                              // "Sin nombre", 0.0 (decidido por mi)
    }
}
