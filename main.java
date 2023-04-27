import java.util.*;

class Student {
    private String name;
    private int rollNumber;
    private float marks;
    
    public Student(String name, int rollNumber, float marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }
    
    public int getRollNumber() {
        return rollNumber;
    }
    
    public float getMarks() {
        return marks;
    }
    
    public void setMarks(float marks) {
        this.marks = marks;
    }
}

class StudentDatabase {
    private List<Student> students;

    public StudentDatabase() {
        students = new ArrayList<Student>();
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
    
}
