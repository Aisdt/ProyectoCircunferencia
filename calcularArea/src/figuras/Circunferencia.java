package figuras;

// Nombre: Alfonso Isaías Santana del Toro
// Curso: DAMN1A
/**
 * Representa una circunferencia con un radio y un color.
 * Proporciona métodos para calcular y mostrar información sobre la circunferencia.
 */
public class Circunferencia {

    /** El radio de la circunferencia. */
    private double radio;

    /** El color de la circunferencia. */
    private String color;

    /**
     * Construye una nueva circunferencia con el radio especificado.
     *
     * @param radio el radio de la circunferencia. Debe ser mayor que 0.
     * @throws IllegalArgumentException si el radio es menor o igual a 0.
     */
    public Circunferencia(double radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser mayor que 0.");
        }
        this.radio = radio;
    }

    /**
     * Imprime información sobre la circunferencia, incluyendo el diámetro,
     * el color y el área.
     */
    public void imprimir() {
        this.color = "rojo"; // Inicialización del atributo color
        System.out.println("Diámetro: " + (2 * radio)); // Cálculo en línea
        System.out.println("Color: " + color);
        System.out.println("Área: " + (3.1416 * radio * radio)); // Cálculo directo del área en línea
    }

    /**
     * Compara si esta circunferencia es igual a otra, con o sin considerar los
     * decimales en el cálculo.
     *
     * @param considerarDecimales indica si se deben considerar los decimales en la comparación.
     * @param otra                la otra circunferencia con la que se compara.
     * @return {@code true} si las circunferencias son iguales, {@code false} en caso contrario.
     * @throws IllegalArgumentException si la circunferencia comparada es {@code null}.
     */
    public boolean esIgual(boolean considerarDecimales, Circunferencia otra) {
        if (otra == null) {
            throw new IllegalArgumentException("La circunferencia comparada no puede ser nula.");
        }

        double radio1 = this.radio;
        double radio2 = otra.getRadio();

        if (considerarDecimales) {
            return radio1 == radio2;
        }
        return Math.abs(radio1 - radio2) < 1;
    }

    /**
     * Obtiene el radio de la circunferencia.
     *
     * @return el radio de la circunferencia.
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Establece el radio de la circunferencia.
     *
     * @param radio el nuevo radio. Debe ser mayor que 0.
     * @throws IllegalArgumentException si el radio es menor o igual a 0.
     */
    public void setRadio(double radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser mayor que 0.");
        }
        this.radio = radio;
    }

    /**
     * Obtiene el color de la circunferencia.
     *
     * @return el color de la circunferencia.
     */
    public String getColor() {
        return color;
    }
}







