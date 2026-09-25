/**
 * PASO 2 - new vs método vs asignación de referencias
 * Muestra que est2 = est1 (sin new) NO crea un objeto nuevo.
 */
public class Paso02_Referencias {
    public static void main(String[] args) {
        EstudianteV1 est1 = new EstudianteV1();   // new -> nace un objeto
        est1.setNombre("Ana");                    // método -> modifica el objeto que ya existía

        EstudianteV1 est2 = est1;                 // SIN new -> no nace nada, mismo objeto
        est2.setNombre("Luis");

        est1.mostrarInfo();                       // imprime Luis: est1 y est2 son el MISMO objeto
    }
}
