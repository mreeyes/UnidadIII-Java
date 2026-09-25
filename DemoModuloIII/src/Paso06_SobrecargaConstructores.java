/**
 * PASO 6 - Diapositivas 12 y 13 (SOBRECARGA DE CONSTRUCTORES + this(...))
 * Sigue los mensajes ">>" en consola para ver el recorrido de cada new.
 */
public class Paso06_SobrecargaConstructores {
    public static void main(String[] args) {
        System.out.println("new Producto():");
        Producto p1 = new Producto();

        System.out.println("\nnew Producto(\"Lápiz\"):");
        Producto p2 = new Producto("Lápiz");

        System.out.println("\nnew Producto(\"Cuaderno\", 2.75):");
        Producto p3 = new Producto("Cuaderno", 2.75);

        System.out.println("\nnew Producto(\"Borrador\", -5):");
        Producto p4 = new Producto("Borrador", -5);   // la validación lo deja en 0

        System.out.println("\nResultados:");
        System.out.println(p1.getInfo());
        System.out.println(p2.getInfo());
        System.out.println(p3.getInfo());
        System.out.println(p4.getInfo());
    }
}
