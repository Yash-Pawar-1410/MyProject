package OOPs.Inheritance.Cases_in_inheritance;

public class AccessPoint extends ChildClass{
    public static void main(String[] args) {

        // Parent class reference = parent class object

        ParentClass parentClass=new ParentClass();
        System.out.println("Data contain only in parent class");
        System.out.println(parentClass.a); //10                                                        ( Instance variable )
        System.out.println(ParentClass.f); //60                                                        ( static variable )
        parentClass.m1();                        //                                                    ( Instance method )
        ParentClass.m2();                          //                                                  ( static method )
        System.out.println("-------------------------------------------------------");
        System.out.println("common data contain in both parent and child class");
        System.out.println(parentClass.d); //22 print the parent class value not a child class          ( Instance variable )
        System.out.println(ParentClass.b); //20 print the parent class value not a child class          ( static variable )
        parentClass.m5(); // print the parent class method not a child class                            ( Instance method )
        ParentClass.m6(); // print the parent class method not a child class                            ( static method )
        System.out.println("-------------------------------------------------------");
    }
}
