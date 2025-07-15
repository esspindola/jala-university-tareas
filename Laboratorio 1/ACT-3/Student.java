
import java.util.ArrayList;
import java.util.List;

/**
 * Clase Student: Representa a un estudiante con nombre, calificación y cursos.
 * Implementa encapsulamiento para sus atributos.
 */
class Student {

    private String name;
    private int grade;
    private List<String> courses;

    /**
     * Constructor para crear un nuevo estudiante.
     *
     * @param name Nombre del estudiante.
     * @param grade Calificación inicial.
     * @param courses Lista de cursos iniciales.
     */
    public Student(String name, int grade, List<String> courses) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>(courses); // Crea una copia de la lista para encapsulamiento
    }

    /**
     * Constructor alternativo para crear un estudiante con un solo curso
     * inicial.
     *
     * @param name Nombre del estudiante.
     * @param grade Calificación inicial.
     * @param course Un curso inicial.
     */
    public Student(String name, int grade, String course) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
        this.courses.add(course);
    }

    // --- Getters ---
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    /**
     * Devuelve una copia de la lista de cursos para mantener el
     * encapsulamiento.
     *
     * @return Lista de cursos.
     */
    public List<String> getCourses() {
        return new ArrayList<>(courses);
    }

    // --- Setters ---
    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Asigna un nuevo curso al estudiante.
     *
     * @param course Curso a asignar.
     */
    public void addCourse(String course) {
        if (course != null && !course.trim().isEmpty() && !this.courses.contains(course)) {
            this.courses.add(course);
        }
    }

    /**
     * Representación legible del estudiante.
     *
     * @return Cadena con la información del estudiante.
     */
    @Override
    public String toString() {
        return "Name: " + name + ", Grade: " + grade + ", courses: " + courses;
    }
}
