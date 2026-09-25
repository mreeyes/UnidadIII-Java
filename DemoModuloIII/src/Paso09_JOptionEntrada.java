import javax.swing.JOptionPane;

/**
 * PASO 9 - Diapositivas 20 y 21 (ENTRADA CON VENTANA + CONVERSIÓN)
 * Demo clave: showInputDialog SIEMPRE devuelve un String.
 */
public class Paso09_JOptionEntrada {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        String texto = JOptionPane.showInputDialog("Ingrese su edad:");

        // Sin convertir: si el usuario escribe 20, esto imprime "201", no 21
        System.out.println("Sin convertir: " + texto + 1);

        int edad = Integer.parseInt(texto);                  // convertir
        System.out.println("Convertido:    " + (edad + 1));  // 21

        JOptionPane.showMessageDialog(null,
                "Hola " + nombre + ", el próximo año tendrás " + (edad + 1));
    }
}
