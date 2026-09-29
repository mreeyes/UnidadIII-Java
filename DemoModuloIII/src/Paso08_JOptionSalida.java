import javax.swing.JOptionPane;

/**
 *  Diapositiva 19 (SALIDA CON VENTANAS)
 */
public class Paso08_JOptionSalida {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido a JAVA");

        // esta es una version con título e ícono (opcional)
        JOptionPane.showMessageDialog(null, "Datos guardados", "Aviso",
                JOptionPane.INFORMATION_MESSAGE);

        System.out.println("cerrado las ventanas");
    }
}
