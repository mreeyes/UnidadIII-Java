/**
 *  (diapositivas 12 y 13): SOBRECARGA DE CONSTRUCTORES + this(...)
 *
 */
public class Producto {

    private String nombre;
    private double precio;

    // Constructor 1: sin datos delega al completo
    public Producto() {
        this("Sin nombre", 0.0);      // DEBE ser la primera línea
        System.out.println("   >> terminó Producto()");
    }

    // Constructor 2: solo nombre -y  delega al completo
    public Producto(String nombre) {
        this(nombre, 0.0);            // DEBE ser la primera línea
        System.out.println("   >> terminó Producto(String)");
    }

    // Constructor 3: el COMPLETO. Es el único que asigna y valida.
    public Producto(String nombre, double precio) {
        System.out.println("   >> entró a Producto(String, double)");
        this.nombre = nombre;
        if (precio < 0) {
            this.precio = 0;          // la validación vive en UN solo lugar
        } else {
            this.precio = precio;
        }
    }

    // ---------------------------------------------------------------
    // DEMO regla de this(...): descomenta y verás el error de compilación
    // porque this(...) no es la primera instrucción.
    //
    // public Producto(double precio) {
    //     System.out.println("Hola");
    //     this("Sin nombre", precio);
    // }
    // ---------------------------------------------------------------

    public String getInfo() {
        return nombre + " - $" + precio;
    }
}
