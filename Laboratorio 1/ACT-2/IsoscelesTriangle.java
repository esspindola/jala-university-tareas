
/**
 * Representa un Triángulo Isósceles.
 * Implementa los cálculos específicos para un triángulo isósceles.
 */
class IsoscelesTriangle extends Triangle {

    private double base;        // Atributo: longitud de la base
    private double equalSide; // Atributo: longitud de los dos lados iguales

    /**
     * Constructor para crear un Triángulo Isósceles.
     *
     * @param base La longitud de la base.
     * @param equalSide La longitud de los lados iguales.
     */
    public IsoscelesTriangle(double base, double equalSide) {
        this.base = base;
        this.equalSide = equalSide;
    }

    /**
     * Calcula el área usando la fórmula: 0.5 * base * altura. La altura se
     * calcula con el teorema de Pitágoras.
     */
    @Override
    public double calculateArea() {
        double height = Math.sqrt(equalSide * equalSide - (base / 2) * (base / 2));
        return 0.5 * base * height;
    }

    /**
     * Calcula el perímetro de un triángulo isósceles: 2 * lado_igual + base.
     */
    @Override
    public double calculatePerimeter() {
        return 2 * equalSide + base;
    }

    /**
     * Devuelve el nombre específico de la figura.
     */
    @Override
    public String getName() {
        return "Isosceles Triangle";
    }
}
