import java.util.*;

class Car {
    String name;
    String color;
    int engineHP; //engine Horse Power
    
    Car(String name, String color,int engineHP) {
        this.name = name;
        this.color = color;
        this.engineHP = engineHP;
    }
    
    public void drive() {
       System.out.println(name + " Car is driving");
    }
    
    public void reverse() {
        System.out.println(name + " Car is in reverse mode");
    }
}

class FlyingCar extends Car {
    
    FlyingCar(String name, String color, int engineHP) {
        super(name,color,engineHP);
    }
    
    public void fly() {
        System.out.println("Flying Car is flying");
    }
}

class HydroCar extends Car {
    
    HydroCar(String name, String color, int engineHP) {
        super(name,color,engineHP);
    }
    
    public void swim() {
        System.out.println("Hydro car is driving on the surface of the water");
    }
}

public class Main {
    public static void main(String[] args) {
        FlyingCar fc = new FlyingCar("SuperFly","Black",5000);
        fc.drive();
        fc.reverse();
        fc.fly();
        
        HydroCar hc = new HydroCar("SuperSwim","Black",5000);
        hc.drive();
        hc.reverse();
        hc.swim();
    }
}
