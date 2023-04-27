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
