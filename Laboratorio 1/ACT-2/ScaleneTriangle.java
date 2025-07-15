
/**
 * Representa un Triángulo Escaleno.
 * Implementa los cálculos específicos para un triángulo escaleno (todos los lados diferentes).
 */
class ScaleneTriangle extends Triangle {

    private double sideA, sideB, sideC; // Atributos: longitudes de los tres lados

    /**
     * Constructor para crear un Triángulo Escaleno.
     *
     * @param sideA Longitud del primer lado.
     * @param sideB Longitud del segundo lado.
     * @param sideC Longitud del tercer lado.
     */
    public ScaleneTriangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /**
     * Calcula el área usando la fórmula de Herón, que requiere los tres lados.
     * Primero se calcula el semiperímetro (s).
     */
    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2; // Semiperímetro
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    /**
     * Calcula el perímetro de un triángulo escaleno: suma de sus tres lados.
     */
    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    /**
     * Devuelve el nombre específico de la figura.
     */
    @Override
    public String getName() {
        return "Scalene Triangle";
    }
}
