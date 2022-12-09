class Hello implements Runnable {
    public void run() {
        for(int i=1;i<=200;i++) {
            System.out.println("Hello");
        }
    }
}

class Hi implements Runnable {
    public void run() {
        for(int i=1;i<=200;i++) {
            System.out.println("Hi");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Hello());
        Thread t2 = new Thread(new Hi());
        t1.start();
        t2.start();
    }
}
