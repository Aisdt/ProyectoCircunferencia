package figuras;

// Nombre: Alfonso Isaías Santana del Toro
// Curso: DAMN1A

/**
 * Clase de prueba para la clase {@link Circunferencia}.
 */
public class Test {

    /**
     * Punto de entrada principal para probar las funcionalidades de la clase {@link Circunferencia}.
     *
     * @param args argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia(5.0);
        Circunferencia c2 = new Circunferencia(5.1);

        // Comparar circunferencias considerando decimales
        boolean sonIguales = c1.esIgual(true, c2);
        System.out.println("¿Son iguales considerando decimales? " + sonIguales);

        // Comparar circunferencias sin considerar decimales
        sonIguales = c1.esIgual(false, c2);
        System.out.println("¿Son iguales sin considerar decimales? " + sonIguales);

        // Imprimir información de la primera circunferencia
        c1.imprimir();
    }
}

