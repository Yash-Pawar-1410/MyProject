package OOPs.Inheritance.Cases_in_inheritance;

public class ChildClass extends ParentClass{
    int c=10;
    int d=23; // same in both parent class and child class
    static int e=50;
    static int b=25; // same in both parent class and child class
    void m3(){
        System.out.println("this is instance method of child class");
    }
    static void m4(){
        System.out.println("this is static method of child class");
    }
    void m5(){
        System.out.println("this is instance method of child class m5");
    } // same in both parent class and child class
    static void m6(){
        System.out.println("this is static method of child class m6 ");
    } // same in both parent class and child class
}
