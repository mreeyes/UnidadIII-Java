import javax.swing.JOptionPane;

/**
 * Diapositivas 20 y 21 (ENTRADA CON VENTANA + CONVERSIÓN)
 * showInputDialog siempre va a devolver un String.
 */
public class Paso09_JOptionEntrada {
    public static void main(String[] args) {
        String nombre, texto;
         nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
         texto = JOptionPane.showInputDialog("Ingrese su edad:");

        // veamos como sin convertir: si el usuario escribe 20, esto va imprimir  "201", no 21
        System.out.println("Sin convertir: " + texto + 1);

        int edad = Integer.parseInt(texto);                  // es necesario convertir
        System.out.println("Convertido:    " + (edad + 1));  // 21

        JOptionPane.showMessageDialog(null,
                "Hola " + nombre + ", el próximo año tendrás " + (edad + 1));
    }
}
