#include <bits/stdc++.h>
class Student {
  
    public:
    
    string name;
    int roll_no;
    int marks;
    
    Student() {
        cout<<"Student Class Constructor called\n";
    }
    
    Student(string name,int roll_no, int marks) {
        this->name = name;
        this->roll_no = roll_no;
        this-> marks = marks;
    }
       
    void printData() {
        cout<<"My name is "<<name<<" and my roll number is "<<roll_no<<". I got "<<marks<<" marks out of 100\n";
    }
    
};

int main() {
    
    //parameterized constructor is being called
    Student s1("Guneet",2,95);
    s1.printData();
}
