package com.coding.NewOne;

class Base {
    Base(){
        System.out.println("I am a Constructor of Base class.");
    }
}
class Derived extends Base{
    Derived(){
        System.out.println("I am a Constructor of Derived class");
    }
}
public class cylinder {

    public static void main(String[] args) {
        Derived d1 =new Derived();
    }
}

