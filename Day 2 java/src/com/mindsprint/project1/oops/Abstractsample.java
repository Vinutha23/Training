package com.mindsprint.project1.oops;
abstract class Test{
    public abstract void display();
}

public class Abstractsample extends Test{
    public void display(){
        System.out.println("Implemented Parent method");
    }
    public static void main(String[] args){
        Test test = new Abstractsample();
        test.display();
    }
}
