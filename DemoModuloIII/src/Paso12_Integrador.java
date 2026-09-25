import javax.swing.JOptionPane;

/**
 * PASO 12 - Diapositivas 25 y 26 (EJEMPLO INTEGRADOR)
 * Leer -> crear el objeto -> mostrar.
 *
 * RETO para el grupo: reescribir el paso 1 (leer) usando BufferedReader
 * en lugar de JOptionPane. La clase Estudiante NO cambia.
 */
public class Paso12_Integrador {
    public static void main(String[] args) {
        // 1. Leer
        String nombre = JOptionPane.showInputDialog("Nombre:");
        double promedio = Double.parseDouble(JOptionPane.showInputDialog("Promedio:"));

        // 2. Crear el objeto (constructor de 2 parámetros)
        Estudiante est = new Estudiante(nombre, promedio);

        // 3. Mostrar: el MISMO getInfo() sirve para ventana y consola
        JOptionPane.showMessageDialog(null, est.getInfo());
        System.out.println(est.getInfo());
    }
}
