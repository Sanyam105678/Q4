package com.company;

final public class Child extends Parent{
    public Child(int number) {

            super(number);


    }

    @Override
    void method1() {
        System.out.println(this.number);
        System.out.println("Inside Child method1");
    }

    void method4(){

        System.out.println("Inside Child method4");

    }
}
