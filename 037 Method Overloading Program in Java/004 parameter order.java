class Student {
    String name;
    int rollNo;

    Student() {

    }

    // int,string -> parameter order
    Student(int rollNo, String name) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // string,int -> parameter order
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void show() {
        System.out.println("Name = " + name + " Roll No = " + rollNo);
    }
}

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Guneet",14);
        Student s2 = new Student(10,"Yash");
        s1.show(); 
        s2.show();
    }
}
