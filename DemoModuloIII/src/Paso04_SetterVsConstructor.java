/**
 * PASO 4 - Setter vs constructor
 * Dos formas de llegar al mismo resultado: una obliga a compilar con los
 * datos completos, la otra no.
 */
public class Paso04_SetterVsConstructor {
    public static void main(String[] args) {
        // Forma 1: nace vacío y luego se llena con un método
        Estudiante est1 = new Estudiante();
        est1.setNombre("Ana");            // trámite DESPUÉS de nacer

        // Forma 2: nace completo gracias al constructor
        Estudiante est2 = new Estudiante("Ana", 9.5);

        est1.mostrarInfo();
        System.out.println("---");
        est2.mostrarInfo();
    }
}
