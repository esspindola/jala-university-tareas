
import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Student> students;

    public University() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (student != null) {
            students.add(student);
            System.out.println("Estudiante añadido: " + student.getName());
        }
    }

    public void listAllStudents() {
        System.out.println("\n--- Lista de Todos los Estudiantes ---");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("------------------------------------\n");
    }

    public void assignCourseToStudent(int studentIndex, String course) {
        if (studentIndex >= 0 && studentIndex < students.size()) {
            Student student = students.get(studentIndex);
            student.addCourse(course);
            System.out.println("Curso '" + course + "' asignado a " + student.getName());
        }
    }

    public void promoteStudentGrade(int studentIndex) {
        if (studentIndex >= 0 && studentIndex < students.size()) {
            Student student = students.get(studentIndex);
            student.promoteGrade();
            System.out.println("Calificación promovida para " + student.getName() + ". Nueva calificación: " + student.getGrade());
        }
    }

    public List<String> getStudentsByCourse(String course) {
        List<String> names = new ArrayList<>();
        for (Student student : students) {
            if (student.getCourses().contains(course)) {
                names.add(student.getName());
            }
        }
        return names;
    }
}
