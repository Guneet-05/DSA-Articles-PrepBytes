import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        char ch = scn.next().charAt(0);

        switch(ch) {
            case 'A':
                System.out.println("It is a vowel 'A'");
                break;
            case 'E':
                System.out.println("It is a vowel 'E'");
                break;
            case 'I':
                System.out.println("It is a vowel 'I'");
                break;
            case 'O':
                System.out.println("It is a vowel 'O'");
                break;
            case 'U':
                System.out.println("It is a vowel 'U'");
                break;
            default:
                System.out.println("It is a consonant");
                break;
        }

        scn.close();
    }
}
