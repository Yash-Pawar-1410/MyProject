package OOPs.Inheritance.Cases_in_inheritance;

public class AccessPoint1 extends ChildClass{
   public static void main(String[] args) {

      // child class reference = child class object

      ChildClass childClass=new ChildClass();
      System.out.println("Data contain only in child class");
      System.out.println(childClass.c); //10                                                           ( Instance Variable )
      System.out.println(ChildClass.e); //50                                                           ( static variable )
      childClass.m3();//                                                                               ( Instance method )
      ChildClass.m4();//                                                                               ( static method )
      System.out.println("-------------------------------------------------------");
      System.out.println("common data contain in both parent and child class");
      System.out.println(childClass.d); //23    print the child class value  not a parent class         ( Instance Variable )
      System.out.println(ChildClass.b); //25    print the child class value  not a parent class         ( static variable )
      childClass.m5(); // print the child class method not a parent class method                        ( Instance method )
      ChildClass.m6(); // print the child class method not a parent class method                        ( static method )
      System.out.println("-------------------------------------------------------");
   }
}
