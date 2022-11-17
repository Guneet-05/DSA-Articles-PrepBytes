import java.util.*;

class Student {
    String name;
    int marks;
    int rollNo;
    
    void setData(String sName,int sMarks,int sRollNo) {
        name = sName;
        marks = sMarks;
        rollNo = sRollNo;
    }
    
    void displayData() {
        System.out.println("I am " + name + " and my rollNo is " + rollNo + ". I got " + marks + " marks out of 100.");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setData("Guneet",95,2);
        s1.displayData();
    }    
}
