#include <bits/stdc++.h>

class Car {
    
    public:
    
    string name;
    string color;
    int engineHP; //engine horse power
    
    Car() {
        
    }
    
    Car(string name, string color, int engineHP) {
        this->name = name;
        this->color = color;
        this->engineHP = engineHP; 
    }
    
    void drive() {
        cout<<name<<" Car is driving\n";
    }
    
};

class FlyingCar : virtual public Car {
    
    public:
    FlyingCar() {
        
    }
    
    FlyingCar(string name,string color, int engineHP) {
        this->name = name;
        this->color = color;
        this->engineHP = engineHP;
    }
    
    void fly() {
        cout<<name<<" Car is flying\n";
    }
};

class HydroCar : virtual public Car {
    public:
    HydroCar() {
        
    }
    
    HydroCar(string name,string color, int engineHP) {
        this->name = name;
        this->color = color;
        this->engineHP = engineHP;
    }
    
    void swim() {
        cout<<name<<" Car is travelling on the surface of the water\n";
    }  
};

class HydroFlyingCar: public FlyingCar, public HydroCar {
    public:
    HydroFlyingCar() {
        
    }
    
    HydroFlyingCar(string name,string color, int engineHP) {
        this->name = name;
        this->color = color;
        this->engineHP = engineHP;
    }
    
    void hydroFly() {
        cout<<name<<" car is a hydro flying car. It can swim and fly both";
    }
};

int main() {
    
    FlyingCar fc("SuperFly","Black",5000);
    fc.drive();
    fc.fly();
    
    HydroCar hc("SuperHydro","Black",5000);
    hc.drive();
    hc.swim();
    
    HydroFlyingCar hfc("SuperHydroFly","Black",5000);
    hfc.drive();
    hfc.fly();
    hfc.swim();
    hfc.hydroFly();
}
