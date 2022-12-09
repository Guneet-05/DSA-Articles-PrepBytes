public class Main {

    public static int multiply(int a, int b) {
        return a*b;
    }

    public static int multiply(int a, int b, int c) {
        return a*b*c;
    }

    public static void main(String[] args) {
        System.out.println(multiply(10,20));
        System.out.println(multiply(10,20,5));
    }
}
