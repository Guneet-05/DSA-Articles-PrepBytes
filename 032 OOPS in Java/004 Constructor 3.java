import java.util.*;

class Student {
    String name;
    int marks;
    int rollNo;
    
    Student() {
        System.out.println("An object of Student class is created.");
    }
    
    Student(String name, int marks, int rollNo) {
        this.name = name;
        this.marks = marks;
        this.rollNo = rollNo;
    }
    
    Student(Student other) {
        this.name = other.name;
        this.marks = other.marks;
    }
    
    void displayData() {
        System.out.println("I am " + name + " and my rollNo is " + rollNo + ". I got " + marks + " marks out of 100.");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Guneet",95,2);
        s1.displayData();
        Student s2 = new Student(s1);
        s2.rollNo = 1;
        s2.displayData();
    }    
}
