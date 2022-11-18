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
    
    void displayData() {
        System.out.println("I am " + name + " and my rollNo is " + rollNo + ". I got " + marks + " marks out of 100.");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Guneet",95,2);
        s1.displayData();
    }    
}
