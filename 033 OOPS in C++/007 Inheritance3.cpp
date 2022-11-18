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

class FlyingCar : public Car {
    
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

class HydroCar : public Car {
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

int main() {
    
    FlyingCar fc("SuperFly","Black",5000);
    fc.drive();
    fc.fly();
    
    HydroCar hc("SuperHydro","Black",5000);
    hc.drive();
    hc.swim();
}
