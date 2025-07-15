/**
 * Representa un Círculo, heredando de GeometricShape.
 * Implementa los métodos de cálculo de área y perímetro específicos para un círculo.
 */
class Circle extends GeometricShape {
    private double radius; // Atributo: radio del círculo

    /**
     * Constructor para crear un Círculo.
     * @param radius El radio del círculo.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /** Calcula el área de un círculo: π * r^2. */
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    /** Calcula el perímetro de un círculo: 2 * π * r. */
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    /** Devuelve el nombre de la figura. */
    @Override
    public String getName() {
        return "Circle";
    }
}