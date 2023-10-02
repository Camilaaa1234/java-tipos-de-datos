import java.sql.SQLOutput;
import java.time.LocalDate;

/**
 * clase PRINCIPAL
 */
public class PRINCIPAL {
    /**
     * Método inicial que es ejecutado
     * @param args
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public static void main(String[] args) {

        LocalDate fechaNacimientoCamila = LocalDate.of(2006, 26, 5);
        Estudiante cuentaMaria = new Estudiante("Maria", fechaNacimientoCamila);

        System.out.println("Datos del estudiante:");
        System.out.println("Nombre: " + cuentaCamila.getNombre());
        System.out.println("Fecha de Nacimiento: " + cuentaCamila.getFechaNacimiento());
        System.out.println("Edad: " + cuentaCamila.getEdad());
        System.out.println("Promedio de Notas: " + cuentaCamila.getPromedio());

        /**
         * Insertar las notas del estudiante para calcular el promedio
         */
        cuentaCamila.setNotaMateria1(4.0);
        cuentaCamila.setNotaMateria2(5.0);
        cuentaCamila.setNotaMateria3(3.0);

        /**
         * Se obtiene la nota de la materia del estudiante y luego mostrarla por consola
         */
        System.out.println();
        System.out.println("Notas de las Materias:");
        double nota1 = cuentaCamila.getNotaMateria1();
        System.out.println("Materia 1: " + nota1);

        double nota2 = cuentaCamila.getNotaMateria2();
        System.out.println("Materia 2: " + nota2);

        double nota3 = cuentaCamila.getNotaMateria3();
        System.out.println("Materia 3: " + nota3);

        System.out.println("Promedio de Notas: " + cuentaCamila.getPromedio());

        System.out.println();
        /**
         * Utilizar los métodos setNombre y setFechaNacimiento para cambiar el nombre y la fecha de nacimiento
         */

        System.out.println("Datos de "+cuentaCamila.getNombre() + " después del cambio:");
        cuentaCamila.setNombre("Sussy");
        System.out.println("Nombre: " + cuentaCamila.getNombre());
        cuentaCamila.setFechaNacimiento(LocalDate.of(2007, 7, 27));
        System.out.println("Fecha de Nacimiento: " + cuentaCamila.getFechaNacimiento());
        System.out.println("Edad: " + cuentaCamila.getEdad());
    }
}
