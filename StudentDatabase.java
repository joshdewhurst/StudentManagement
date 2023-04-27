import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {
    private List<Student> students;

    public StudentDatabase() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                students.remove(student);
                return;
            }
        }
        System.out.println("Student with roll number " + rollNumber + " not found");
    }

    public void updateStudentMarks(int rollNumber, float marks) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                student.setMarks(marks);
                return;
            }
        }
        System.out.println("Student with roll number " + rollNumber + " not found");
    }

    public void printStudentData() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Roll Number: " + student.getRollNumber() + ", Marks: " + student.getMarks());
        }
    }

    public float calculateAverageMarks() {
        float totalMarks = 0;
        int numStudents = students.size();
        for (Student student : students) {
            totalMarks += student.getMarks();
        }
        return totalMarks/numStudents;
    }
}
