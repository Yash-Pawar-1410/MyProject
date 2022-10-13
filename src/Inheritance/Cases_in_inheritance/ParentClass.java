package Inheritance.Cases_in_inheritance;

public class ParentClass {
    int a=10;
    int d=22; // same in both parent class and child class
    static int f=60;
    static int b=20; // same in both parent class and child class
    void m1(){
        System.out.println("this is instance method of parent class");
    }
    static void m2(){
        System.out.println("this is static method of parent class");
    }
    void m5(){
        System.out.println("this is instance method of parent class m5");
    } // same in both parent class and child class
    static void m6(){
        System.out.println("this is static method of parent class m6 ");
    } // same in both parent class and child class
}
