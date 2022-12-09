class Hello extends Thread {
    public void run() {
        for(int i=1;i<=200;i++) {
            System.out.println("Hello");
        }
    }
}

class Hi extends Thread{
    public void run() {
        for(int i=1;i<=200;i++) {
            System.out.println("Hi");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Hello t1 = new Hello();
        Hi t2 = new Hi();
        t1.start();
        t2.start();
    }
}
