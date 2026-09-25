import javax.swing.JOptionPane;

/**
 * PASO 8 - Diapositiva 19 (SALIDA CON VENTANAS)
 */
public class Paso08_JOptionSalida {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido a DS II");

        // Versión con título e ícono (opcional)
        JOptionPane.showMessageDialog(null, "Datos guardados", "Aviso",
                JOptionPane.INFORMATION_MESSAGE);

        System.out.println("Esto se imprime DESPUÉS de cerrar las ventanas");
    }
}
