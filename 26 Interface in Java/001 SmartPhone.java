import java.util.*;

class Phone {
    
    void makeCall(String person) {
        
    }
    
    void sendMessage(String person) {
        
    }
}

interface Camera {
    void clickPicture();
    
    void recordVideo();
}

class SmartPhone extends Phone implements Camera{
    public void clickPicture() {
        System.out.println("Auto focus on human face");
    }
    
    public void recordVideo() {
        System.out.println("Auto removal of background noise");
    }
    
    public void accessInternet() {
        System.out.println("Woah! I'm smart enough to do this");
    }
}

public class Main {
    
    public static void main(String[] args) {
        
    }
}
