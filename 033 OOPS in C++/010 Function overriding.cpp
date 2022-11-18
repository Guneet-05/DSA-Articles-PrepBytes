#include <bits/stdc++.h>

class A {
   public:
      void meth() {
           cout<<"Class A meth invoked\n";
      }  
};

class B : public A{
    public:
        void meth() {
            cout<<"Class B meth invoked\n";
        }
};

int main() {
    A obj1;
    obj1.meth();
    
    B obj2;
    obj2.meth();
}
