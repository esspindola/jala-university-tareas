
/**
 * Representa un Triángulo Equilátero.
 * Implementa los cálculos específicos para un triángulo equilátero.
 */
class EquilateralTriangle extends Triangle {

    private double side; // Atributo: longitud del lado

    /**
     * Constructor para crear un Triángulo Equilátero.
     *
     * @param side La longitud del lado.
     */
    public EquilateralTriangle(double side) {
        this.side = side;
    }

    /**
     * Calcula el área de un triángulo equilátero: (sqrt(3)/4) * lado^2.
     */
    @Override
    public double calculateArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    /**
     * Calcula el perímetro de un triángulo equilátero: 3 * lado.
     */
    @Override
    public double calculatePerimeter() {
        return 3 * side;
    }

    /**
     * Devuelve el nombre específico de la figura.
     */
    @Override
    public String getName() {
        return "Equilateral Triangle";
    }
}
