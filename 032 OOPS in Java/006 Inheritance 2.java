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
       System.out.println("Car is driving");
    }
    
    public void reverse() {
        System.out.println("Car is in reverse mode");
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

class HydroFlyingCar extends FlyingCar {
    HydroFlyingCar(String name, String color, int engineHP) {
        super(name,color,engineHP);
    }
    
    public void driveInWater() {
        System.out.println("Hydro-flying car driving on the surface of the water");
    }
}

public class Main {
    public static void main(String[] args) {
        HydroFlyingCar hfc = new HydroFlyingCar("SuperFlySwim","Black",5000);
        hfc.drive();
        hfc.reverse();
        hfc.fly();
        hfc.driveInWater();
    }
}
