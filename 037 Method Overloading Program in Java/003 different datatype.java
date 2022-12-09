class Student {
    String name;
    int rollNo;

    Student() {

    }

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void show(String name) {
        System.out.println("You have entered the name of the student as " + name);
        System.out.println("The roll number of " + name + " is = " + rollNo);
    }

    public void show(int rollNo) {
        System.out.println("You have entered the rollNo of the student = " + rollNo);
        System.out.println("The name of the student with the roll number = " + rollNo + " is " + name);
    }
}

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Guneet",14);
        Student s2 = new Student("Yash",10);
        s1.show(s1.name); 
        s2.show(s2.rollNo);
    }
}
