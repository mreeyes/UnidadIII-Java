/**
 *  new vs método vs asignación de referencias
 * Muestra que est2 = est1 (sin new) NO crea un objeto nuevo.
 */
public class Paso02_Referencias {
    public static void main(String[] args) {
        EstudianteV1 est1 = new EstudianteV1();   // new,  nace el objeto
        est1.setNombre("Ana");                    // método que modifica el objeto que ya existía

        EstudianteV1 est2 = est1;                 // sin new, no estamos haciendo nada es el  mismo objeto asignado con otro nombre
        est2.setNombre("Luis");

        est1.mostrarInfo();                       // va a imprime Luis ya que est1 y est2 son el mismo objeto
    }
}
