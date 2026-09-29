import javax.swing.JOptionPane;

/**
 *  Diapositiva 22 (ERRORES COMUNES)
 *
 *
 */
public class Paso10_Errores {
    public static void main(String[] args) {

        // ---- Error 1: texto que no es número  NumberFormatException ----
        // int edad = Integer.parseInt("veinte");
        // System.out.println(edad);

        // ---- Error 2: coma decimal  NumberFormatException ----
        // double nota = Double.parseDouble("9,5");
        // System.out.println(nota);

        // ---- Error 3: presionar Cancelar showInputDialog devuelve null ----
        // String t = JOptionPane.showInputDialog("Edad (presiona Cancelar):");
        // System.out.println("t vale: " + t);
        // int edad2 = Integer.parseInt(t);

    }
}
