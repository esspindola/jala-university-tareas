
/**
 * Define la interfaz común para todas las figuras geométricas
 * Obliga a las subclases a implementar métodos para calcular area, perimetro y obtener su nombre
 */
abstract class GeometricShape {

    /**
     * Calcula y devuelve el area de la figura. Debe ser implementado por las
     * subclases.
     *
     * @return El area de la figura.
     */
    public abstract double calculateArea();

    /**
     * Calcula y devuelve el perimetro   de la figura. Debe ser implementado por
     * las subclases.
     *
     * @return El perimetro de la figura.
     */
    public abstract double calculatePerimeter();

    /**
     * Devuelve el nombre de la figura. Debe ser implementado por las subclases.
     *
     * @return El nombre de la figura.
     */
    public abstract String getName();

    /**
     * Devuelve una representacion de cadena formateada de la figura, incluyendo
     * su nombre, area y perimetro. Las subclases pueden sobrescribir este
     * metodo si necesitan un formato diferente.
     *
     * @return Cadena con los detalles de la figura.
     */
    @Override
    public String toString() {
        return String.format("%s, area: %.3f perimeter: %.4f",
                getName(),
                calculateArea(),
                calculatePerimeter());
    }
}
