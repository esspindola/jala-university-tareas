
/**
 * Clase principal que demuestra el uso de las diferentes figuras geométricas.
 * Crea instancias de cada figura y calcula/muestra su área y perímetro.
 */
public class GeometryCalculator {

    public static void main(String[] args) {
        System.out.println("--- Calculadora de Figuras Geométricas ---");

        // Crear y mostrar Círculo
        GeometricShape circle = new Circle(5);
        System.out.println(circle.toString());

        // Crear y mostrar Rectángulo
        GeometricShape rectangle = new Rectangle(15, 7);
        System.out.println(rectangle.toString());

        // Crear y mostrar Cuadrado
        GeometricShape square = new Square(2);
        System.out.println(square.toString());

        // Crear y mostrar Triángulo Equilátero
        GeometricShape equilateralTriangle = new EquilateralTriangle(7);
        System.out.println(equilateralTriangle.toString());

        // Crear y mostrar Triángulo Isósceles
        GeometricShape isoscelesTriangle = new IsoscelesTriangle(6, 5);
        System.out.println(isoscelesTriangle.toString());

        // Crear y mostrar Triángulo Escaleno
        GeometricShape scaleneTriangle = new ScaleneTriangle(3, 4, 5);
        System.out.println(scaleneTriangle.toString());

        System.out.println("\n--- Demostración de Polimorfismo ---");
        // Usando polimorfismo: un arreglo de la clase base puede contener objetos de cualquier subclase.
        GeometricShape[] shapes = {
            new Circle(3),
            new Rectangle(4, 6),
            new EquilateralTriangle(5),
            new IsoscelesTriangle(8, 5),
            new ScaleneTriangle(7, 8, 9)
        };

        // Iterar y mostrar información de cada figura polimórficamente.
        for (GeometricShape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
