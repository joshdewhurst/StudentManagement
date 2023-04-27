import java.util.Scanner;

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
                case 2:
                    System.out.print("Enter roll number of student to be deleted: ");
                    rollNumber = scanner.nextInt();
                    database.deleteStudent(rollNumber);
                    break;
                case 3:
                    System.out.print("Enter roll number of student to update marks: ");
                    rollNumber = scanner.nextInt();
                    System.out.print("Enter new marks: ");
                    marks = scanner.nextFloat();
                    database.updateStudentMarks(rollNumber, marks);
                    break;
                case 4:
                    database.printStudentData();
                    break;
                case 5:
                    System.out.println("Average marks: " + database.calculateAverageMarks());
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);
    }
}
