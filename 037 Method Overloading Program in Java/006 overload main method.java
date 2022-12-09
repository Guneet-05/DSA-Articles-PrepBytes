public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to PrepBytes (From Main method)");
        main("Guneet");
    }

    public static void main(String arg) {
        System.out.println("Welcome to PrepBytes " + arg);
        main("Guneet","Yash");
    }

    public static void main(String arg1,String arg2) {
        System.out.println("Welcome to PrepBytes " + arg1 + " and " + arg2);
    }
}
