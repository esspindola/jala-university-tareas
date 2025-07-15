
/**
 * Representa un Cuadrado, que es un caso especial de Rectángulo.
 * Hereda la lógica de cálculo y solo necesita especificar su nombre.
 */
class Square extends RectangleBase {

    /**
     * Constructor para crear un Cuadrado.
     *
     * @param side La longitud del lado del cuadrado.
     */
    public Square(double side) {
        // Un cuadrado es un rectángulo con ancho y alto iguales.
        super(side, side);
    }

    /**
     * Devuelve el nombre de la figura.
     */
    @Override
    public String getName() {
        return "Square";
    }
}
