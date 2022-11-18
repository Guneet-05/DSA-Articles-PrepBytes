#include <bits/stdc++.h>
class Student {
  
    public:
    
    string name;
    int roll_no;
    int marks;
    
    void setData(string name,int roll_no, int marks) {
        this->name = name;
        this->roll_no = roll_no;
        this-> marks = marks;
    }
    
    void printData() {
        cout<<"My name is "<<name<<" and my roll number is "<<roll_no<<". I got "<<marks<<" marks out of 100\n";
    }
    
};

int main() {
    // s1 is an object of class Student
    Student s1;
    s1.setData("Guneet",2,95);
    s1.printData();
}
