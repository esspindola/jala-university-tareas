
/**
 * Clase abstracta base para todas las figuras de Triángulo.
 * Sirve como punto de partida para los diferentes tipos de triángulos.
 */
abstract class Triangle extends GeometricShape {

    /**
     * El nombre genérico para una figura de triángulo. Las clases hijas lo
     * especificarán.
     */
    @Override
    public String getName() {
        return "Triangle";
    }
}
