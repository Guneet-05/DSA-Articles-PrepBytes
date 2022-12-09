class Hello {
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("Hello");
        }
    }
}

class Hi {
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("Hi");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Hello t1 = new Hello();
        Hi t2 = new Hi();
        t1.run();
        t2.run();
    }
}
