/**
 * PASOS 1 y 2 (diapositiva 3)
 * Versión del Módulo II: esta clase NO tiene ningún constructor escrito.
 * Java agrega uno vacío e invisible:  public EstudianteV1() { }
 * (se puede comprobar con:  javap EstudianteV1)
 */
public class EstudianteV1 {

    private String nombre;     // valor por defecto: null
    private double promedio;   // valor por defecto: 0.0

    // Esto es un MÉTODO (setter), NO un constructor:
    // tiene void, otro nombre y se llama DESPUÉS de que el objeto nació.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
    }
}
