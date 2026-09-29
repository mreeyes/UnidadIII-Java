/**
 *  (diapositivas 12 y 13): SOBRECARGA DE CONSTRUCTORES + this(...)
 */
public class Producto {

    private String nombre;
    private double precio;

    // Constructor 1: sin datos, este delega al completo
    public Producto() {
        this("Sin nombre", 0.0);      // esta debe ser la primera línea(sino error)
        System.out.println("   >> terminó Producto()");
    }

    // Constructor 2: solo nombre, este delega al completo
    public Producto(String nombre) {
        this(nombre, 0.0);           // esta debe ser la primera línea
        System.out.println("   >> terminó Producto(String)");
    }

    // Constructor 3: el que esta completo. Es el único que va a asignar y validar.
    public Producto(String nombre, double precio) {
        System.out.println("   >> entró a Producto(String, double)");
        this.nombre = nombre;
        if (precio < 0) {
            this.precio = 0;          // esta es la validación que vive en un solo lugar
        } else {
            this.precio = precio;
        }
    }

   //metodo que retorna los valores.
    public String getInfo() {
        return nombre + " - $" + precio;
    }
}
