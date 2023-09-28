/**
 * Clase Animales
 */
public class Animales {
    /**
     * Atributos:
     */
    String nombre;
    String sonido;

    /**
     * @param nombre Nombre del animal
     * @param sonido Sonido que hace el animal
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    Animales(String nombre, String sonido) {
        this.nombre = nombre;
        this.sonido = sonido;
    }

    /**
     * Método de imprime el sonido que hace el animal
     * Complejidad temporal: O(1) Complejidad Constante
     */
    void hacerSonido() {
        System.out.println("El " + nombre + " hace " + sonido);
    }
}
