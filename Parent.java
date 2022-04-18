package com.company;

import java.util.Scanner;

public abstract class Parent {

    final int number;

    public Parent(int number) {
        this.number = number;
    }


    abstract void method1();
    final void method2(){
        System.out.println("Inside Parent method2");

    }
    void method3(){
        System.out.println("Inside Parent method3");

    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number: ");
        int n=sc.nextInt();
        if(n>=1 && n<=10) {
            Child childobj = new Child(n);
            childobj.method1();
            Parent parentobj = new Parent(n) {
                @Override
                void method1() {
                    System.out.println("Inside Parent menthod1");
                }
            };
            parentobj.method1();
            parentobj.method2();
            parentobj.method3();
            childobj.method4();
        } else
            System.out.println("Invalid number");

    }
}
