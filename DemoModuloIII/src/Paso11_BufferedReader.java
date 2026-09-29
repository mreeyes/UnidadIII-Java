import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  Diapositiva 23 (ENTRADA POR CONSOLA CON BufferedReader)
 * es importante que hagamos clic en la consola de IntelliJ antes de escribir la respuesta.
 */
public class Paso11_BufferedReader {
    public static void main(String[] args) throws IOException {
        // System.in (bytes), InputStreamReader, (caracteres) BufferedReader (líneas)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese su nombre: ");
        String nombre = br.readLine();                          // va a deolver un String

        System.out.print("Ingrese su promedio: ");
        double promedio = Double.parseDouble(br.readLine());    // hay que convertir

        System.out.println("Hola " + nombre + ", tu promedio es " + promedio);
    }
}
