import java.util.*;

interface i1 {
    void meth1();
    void meth2();
    
    default void meth3() {
        System.out.println("This is the default method for this interface");
    }
}

class A implements i1{
    public void meth1() {
        System.out.println("Class A implementation of meth1");
    }
    
    public void meth2() {
        System.out.println("Class A implementation of meth2");
    }
    
    public void meth3() {
        System.out.println("Class A implementation of meth3");
    }
}

class B implements i1 {
    public void meth1() {
        System.out.println("Class B implementation of meth1");
    }
    
    public void meth2() {
        System.out.println("Class B implementation of meth2");
    }
}

public class Main {
    
    public static void main(String[] args) {
        A objA = new A();
        objA.meth1();
        objA.meth2();
        objA.meth3();
        
        B objB = new B();
        objB.meth1();
        objB.meth2();
        objB.meth3();
    }
}
