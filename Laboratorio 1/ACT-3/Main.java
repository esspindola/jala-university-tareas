
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Clase principal Main: Ejecuta el ejemplo de la universidad.
 */
public class Main {

    public static void main(String[] args) {

        University myUniversity = new University();

        // Crear y añadir estudiantes
        Student student1 = new Student("Francisco", 1, "induction");
        myUniversity.addStudent(student1);

        List<String> coursesForBalto = new ArrayList<>(Arrays.asList("maths", "science"));
        Student student2 = new Student("Balto", 2, coursesForBalto);
        myUniversity.addStudent(student2);

        Student student3 = new Student("Gonzalo", 1, new ArrayList<>());
        myUniversity.addStudent(student3);

        Student student4 = new Student("Tu mama", 3, new ArrayList<>(Arrays.asList("science", "database I")));
        myUniversity.addStudent(student4);

        Student student5 = new Student("Ikaoss", 2, new ArrayList<>(Arrays.asList("maths", "physics")));
        myUniversity.addStudent(student5);

        Student student6 = new Student("Trebor", 1, new ArrayList<>(Arrays.asList("Brawl Stars")));
        myUniversity.addStudent(student6);

        Student student7 = new Student("GuilleVGX", 3, new ArrayList<>(Arrays.asList("Clash Of clans", "database I")));
        myUniversity.addStudent(student7);

        // Asignar un nuevo curso
        myUniversity.assignCourseToStudent(2, "Database I");
        myUniversity.assignCourseToStudent(1, "science");

        System.out.println("\n==============================");
        System.out.println("Bienvenidos a la Universidad\n");
        System.out.println("--- Estado inicial de los estudiantes ---");
        myUniversity.listAllStudents();

        myUniversity.promoteStudentGrade(0);
        myUniversity.promoteStudentGrade(2);

        System.out.println("\n--- Estado después de promociones ---");
        myUniversity.listAllStudents();

        String courseToFilter = "science";
        List<String> studentsInScience = myUniversity.getStudentsByCourse(courseToFilter);
        System.out.println("\nEstudiantes en el curso '" + courseToFilter + "':");
        for (String name : studentsInScience) {
            System.out.println("   - " + name);
        }

        String courseToFilter2 = "maths";
        List<String> studentsInMaths = myUniversity.getStudentsByCourse(courseToFilter2);
        System.out.println("\nEstudiantes en el curso '" + courseToFilter2 + "':");
        for (String name : studentsInMaths) {
            System.out.println("   - " + name);
        }

        System.out.println("\n==============================");
        System.out.println("Fin del reporte universitario\n");
    }
}
