import java.util.*;

class Phone {
    
    void makeCall(String person) {
        
    }
    
    void sendMessage(String person) {
        
    }
}

interface Camera {
    
    int megaPixels = 48;
    
    void clickPicture();
    
    void recordVideo();
}

interface Calculator {
    
    void add(int x,int y);
    void subtract(int x, int y);
    void multiply(int x, int y);
    void divide(int x, int y);
}

class SmartPhone extends Phone implements Camera, Calculator{
    public void clickPicture() {
        System.out.println("Auto focus on human face");
    }
    
    public void recordVideo() {
        System.out.println("Auto removal of background noise");
    }
    
    public void accessInternet() {
        System.out.println("Woah! I'm smart enough to do this");
    }
    
    public void add(int x, int y) {
        System.out.println(x + y);
    }
    
    public void subtract(int x, int y) {
        System.out.println(x - y);
    }
    
    public void multiply(int x, int y) {
        System.out.println(x * y);
    }
    
    public void divide(int x, int y) {
        System.out.println(x / y);
    }
}

public class Main {
    
    public static void main(String[] args) {
        SmartPhone PrepPhone = new SmartPhone();
        PrepPhone.clickPicture();
        PrepPhone.add(10,20);
    }
}
