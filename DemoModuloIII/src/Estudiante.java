/**
 * (diapositivas 4-9 y 25)
 * Versión: con constructores escritos por nosotros.
 */
public class Estudiante {

    private String nombre;
    private double promedio;

    // ---------------------------------------------------------------
    // el constructor esta vacio (sobrecarga): delega al completo con this(...)
    //
    //  diapositiva 9: comentar este constructor completo para mirar el
    //  error en DemoClase, en la línea  new Estudiante()
    //  sin él, no se agrega el constructor vacío por defecto.
    // ---------------------------------------------------------------
    public Estudiante() {
        this("Sin nombre", 0.0);
    }

    // ---------------------------------------------------------------
    // el constructor aqui esta completo
    // se ejecuta automáticamente con new, una vez por objeto
    // ---------------------------------------------------------------
    public Estudiante(String nombre, double promedio) {
        System.out.println(" Se ejecutó el constructor de Estudiante");
        this.nombre = nombre;          // this.nombre = atributo, nombre = parámetro
        this.promedio = promedio;

        //  diapositiva 8: si cambiamos la línea de arriba por
        //     nombre = nombre;
        // se compilara si, pero el nombre saldra null (el parámetro se asigna a sí mismo).
    }


    // Setter: este si es un metodo  que cambia el dato despues de que el objeto nació
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
    }
    public String getInfo(){
        return "estudiante" + nombre + "promedio" + promedio;
    }

}
