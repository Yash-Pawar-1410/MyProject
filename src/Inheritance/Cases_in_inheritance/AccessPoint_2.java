package Inheritance.Cases_in_inheritance;

public class AccessPoint_2 extends ChildClass{
    public static void main(String[] args) {

        // parent class referencce = child class object

        ParentClass parent_child_class= new ChildClass();
        System.out.println("Data contain only in parent class");
        System.out.println(parent_child_class.a); //10                                                        ( Instance variable )
        System.out.println(ParentClass.f); //60                                                               ( static variable )
        parent_child_class.m1();                        //                                                    ( Instance method )
        ParentClass.m2();                          //                                                         ( static method )
        System.out.println("-------------------------------------------------------");
        System.out.println("common data contain in both parent and child class");
        System.out.println(parent_child_class.d); //22 print the parent class value not a child class          ( Instance variable )
        System.out.println(ParentClass.b); //20 print the parent class value not a child class                 ( static variable )
        parent_child_class.m5(); // print the child class method not a parent class                            ( Instance method )
        ParentClass.m6(); // print the parent class method not a child class                                   ( static method )
        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------------------------------------------");



        System.out.println("Data contain only in child class");
        System.out.println(((ChildClass) parent_child_class).c); //10                                           ( Instance Variable )
        System.out.println(ChildClass.e); //50                                                                  ( static variable )
        ((ChildClass) parent_child_class).m3();//   print child class method not a parent class                 ( Instance method )
        ChildClass.m4();//     print child class method not a parent class                                       ( static method )
        System.out.println("-------------------------------------------------------");
        System.out.println("common data contain in both parent and child class");
        System.out.println(parent_child_class.d); //22    print the parent class value  not a child class         ( Instance Variable )
        System.out.println(ChildClass.b); //25    print the child class value  not a parent class   due to class name ( static variable )
        parent_child_class.m5(); // print the child class method not a parent class method                        ( Instance method )
        ChildClass.m6(); // print the child class method not a parent class method                                ( static method )
        System.out.println("-------------------------------------------------------");
    }
}
