import java.util.*;

class A {
    void meth1() {
        System.out.println("Class A meth1 called");
    }
}

class B extends A{
    
    void meth1() {
        System.out.println("Class B meth1 called");
    }
    
    void meth2() {
        System.out.println("Class B meth2 called");
    }
}

public class Main {

    public static void main(String[] args) {
       
        // parent class reference and object - A meth1 will be called
        A obj1 = new A();
        obj1.meth1();
        
        // child class reference and object - B meth1 will be called
        B obj2 = new B();
        obj2.meth1();
        
//         Method of object is called always and not the reference.
        
        // parent class reference and child class object - B meth1 will be called 
        A obj3 = new B();
        obj3.meth1();
        
        // child class reference and parent class object - not possible
        // B obj4 = new A()
    }
}
