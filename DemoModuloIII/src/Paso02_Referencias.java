/**

 */
public class Paso02_Referencias {
    public static void main(String[] args) {
        EstudianteV1 est1 = new EstudianteV1();
        est1.setNombre("Ana");

        EstudianteV1 est2 = est1;             // est2 apunta a la misma referencia que est1, es decir que, tiene el mismo objeto en memoria que est1, por lo que si se cambia el nombre de est2, también se cambia el nombre de est1
        est2.setNombre("Luis");

        est1.mostrarInfo();
    }
}
