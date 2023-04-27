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
    
    public float calculateAverageMarks() {
        float totalMarks = 0;
        int numStudents = students.size();
        for (Student student : students) {
            totalMarks += student.getMarks();
        }
        return totalMarks/numStudents;
    }
    
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        StudentDatabase database = new StudentDatabase();
        database.addStudent(new Student("John", 101, 85.0f));
        database.addStudent(new Student("Jane", 102, 90.0f));
        database.addStudent(new Student("Mike", 103, 80.0f));
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add student\n2. Delete student\n3. Update student marks\n4. View student data\n5. Calculate average marks\n6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    System.out.print("Enter marks: ");
                    float marks = scanner.nextFloat();
                    database.addStudent(new Student(name, rollNumber, marks));
                    break;
            } }

    }
}
