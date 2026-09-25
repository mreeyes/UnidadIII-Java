/**
 * PASOS 3, 4 y 12 (diapositivas 4-9 y 25)
 * Versión nueva: con constructores escritos por nosotros.
 */
public class Estudiante {

    private String nombre;
    private double promedio;

    // ---------------------------------------------------------------
    // CONSTRUCTOR VACÍO (sobrecarga): delega al completo con this(...)
    //
    // DEMO diapositiva 9: comenta este constructor completo y mira el
    // error en DemoClase, en la línea  new Estudiante()
    // -> sin él, Java ya NO agrega el constructor vacío por defecto.
    // ---------------------------------------------------------------
    public Estudiante() {
        this("Sin nombre", 0.0);
    }

    // ---------------------------------------------------------------
    // CONSTRUCTOR COMPLETO
    // - Mismo nombre que la clase
    // - SIN tipo de retorno (ni siquiera void)
    // - Se ejecuta automáticamente con new, una vez por objeto
    // ---------------------------------------------------------------
    public Estudiante(String nombre, double promedio) {
        System.out.println(">> Se ejecutó el constructor de Estudiante");
        this.nombre = nombre;          // this.nombre = atributo, nombre = parámetro
        this.promedio = promedio;

        // DEMO diapositiva 8: cambia la línea de arriba por
        //     nombre = nombre;
        // Compila, pero el nombre sale null (el parámetro se asigna a sí mismo).
    }

    // ---------------------------------------------------------------
    // DEMO diapositiva 7 (ERROR FRECUENTE): si descomentas esto y le
    // quitas los dos constructores de arriba, verás que con void
    // deja de ser constructor y pasa a ser un MÉTODO normal.
    //
    // public void Estudiante(String nombre) {
    //     this.nombre = nombre;
    // }
    // ---------------------------------------------------------------

    // Setter: MÉTODO que cambia el dato DESPUÉS de que el objeto nació
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
    }

    // Devuelve el texto en vez de imprimirlo:
    // así sirve para consola Y para JOptionPane.
    public String getInfo() {
        return "Estudiante: " + nombre + "\nPromedio: " + promedio;
    }
}
