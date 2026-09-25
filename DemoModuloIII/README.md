# Demo Módulo III — Constructores, Sobrecarga y Entrada/Salida en Java

Código de apoyo para la clase de **Desarrollo de Software II** (Universidad Tecnológica
de Panamá): cierre del Módulo II (constructores y sobrecarga) y arranque del Módulo III,
Unidad I (entrada y salida de datos).

## Cómo está organizado

Cada paso de la clase es un archivo **independiente**, con su propio `main`. No hay que
comentar ni descomentar nada: para probar un paso, se abre su archivo en IntelliJ y se
ejecuta con el botón ▶️ (o clic derecho → *Run*).

### Clases de apoyo (no se ejecutan solas)

| Archivo | Qué es |
|---|---|
| `EstudianteV1.java` | Versión del Módulo II, **sin ningún constructor escrito** |
| `Estudiante.java` | Versión con constructores sobrecargados y `this(...)` |
| `Calculadora.java` | Ejemplo de sobrecarga de métodos (`sumar`) |
| `Producto.java` | Ejemplo de sobrecarga de constructores con validación |

### Pasos de la demo (cada uno tiene su propio `main`)

| Archivo | Diapositivas | Qué muestra |
|---|---|---|
| `Paso01_SinConstructor.java` | 3 | Objeto sin constructor: nace con `null` y `0.0` |
| `Paso02_Referencias.java` | — | `new` vs. método vs. `est2 = est1` (mismo objeto) |
| `Paso03_Constructor.java` | 4–9 | Constructor propio; sobrecarga de constructores |
| `Paso04_SetterVsConstructor.java` | — | Setter vs. constructor, mismo resultado, distinto momento |
| `Paso05_SobrecargaMetodos.java` | 10–11 | Sobrecarga de métodos (`sumar`) |
| `Paso06_SobrecargaConstructores.java` | 12–13 | Sobrecarga de constructores + `this(...)` |
| `Paso07_SalidaConsola.java` | 18 | `print`, `println`, `\n`, trampa de concatenación |
| `Paso08_JOptionSalida.java` | 19 | `JOptionPane.showMessageDialog` |
| `Paso09_JOptionEntrada.java` | 20–21 | `JOptionPane.showInputDialog` siempre devuelve `String` |
| `Paso10_Errores.java` | 22 | Errores comunes (descomentar uno a la vez) |
| `Paso11_BufferedReader.java` | 23 | Entrada por consola con `BufferedReader` |
| `Paso12_Integrador.java` | 25–26 | Ejemplo integrador completo |

## Cómo ejecutar cada paso en IntelliJ

1. Abre el proyecto en IntelliJ (`File` → `Open`, selecciona esta carpeta).
2. En el panel izquierdo, haz doble clic en el archivo del paso que quieras mostrar
   (por ejemplo `Paso03_Constructor.java`).
3. Haz clic en el triángulo verde ▶️ junto al método `main`, o presiona `Shift + F10`.
4. Para los pasos con `JOptionPane` (08, 09, 12) aparecerán ventanas emergentes.
5. Para los pasos con entrada por consola (11), haz clic dentro de la consola antes
   de escribir la respuesta.

## Errores para mostrar en vivo

Dentro de `Estudiante.java`, `Calculadora.java` y `Producto.java` hay bloques de código
comentados, marcados con `DEMO`, listos para descomentar y mostrar el error que
provocan (constructor con `void`, sobrecarga inválida, `this(...)` fuera de la primera
línea, etc.). Revisa los comentarios dentro de cada archivo.

## Requisitos

- JDK 17 o superior.
- IntelliJ IDEA (Community o Ultimate).

## Autor

Preparado para el curso Desarrollo de Software II — Ing. Misael A. Reyes A.
