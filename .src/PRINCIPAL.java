/**
 * Primera clase que es ejecutada
 */
public class PRINCIPAL {
    /**
     * Primer método que se ejecuta en mi aplicación
     * @param args
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public static void main(String[] args) {
        Animal pollito = new Animal("pollito", "pio pio");
        Animal gato = new Animal("gato", "miau");
        Animal cerdito = new Animal("cerdito", "oing");
        Animal perro = new Animal("perro", "guau guau");

        pollito.hacerSonido();
        gato.hacerSonido();
        cerdito.hacerSonido();
        perro.hacerSonido();
    }
}
