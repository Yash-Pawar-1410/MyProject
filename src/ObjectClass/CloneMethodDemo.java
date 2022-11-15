package ObjectClass;

public class CloneMethodDemo implements Cloneable {
    String name;
    int id;

    CloneMethodDemo(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void m1() {
        System.out.println("Student name is " + name);
        System.out.println("Student id is " + id);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("*************************************");
        System.out.println("Original object");
        System.out.println("*************************************");
        // creating the object of CloneMethodDemo
        CloneMethodDemo original = new CloneMethodDemo("yash", 200);
        // calling instance method using original reference
        original.m1();
        System.out.println("*************************************");
        System.out.println("Making copy of the object");
        System.out.println("-------------------------------------");
        System.out.println("it change the value of original object");
        System.out.println("*************************************");
        // making copy of the object using original reference
        CloneMethodDemo copy = original;
        // reassign the values
        copy.name = ("neha");


        copy.id = (300);
        // calling the instance method using copy reference
        // it changes the value of original object
        copy.m1();
        //original object and copy object pointing the same object
        System.out.println("-------------------------------------");
        System.out.println("memory allocation of original and copied object");
        System.out.println(original.hashCode());
        System.out.println(copy.hashCode());
        System.out.println("*************************************");
        System.out.println("Making clone of the object");
        System.out.println("-------------------------------------");
        System.out.println("it assign the values in cloned object");
        System.out.println("*************************************");
        // making clone of the object using original reference
        CloneMethodDemo copy1 = (CloneMethodDemo) original.clone();
        // reassign the value
        copy1.name = "Harshada";
        copy1.id = 400;
        //calling the instance method using copy1 reference
        //it makes the clone of  the object and assign the value in cloned object
        copy1.m1();
        // original object
        System.out.println("-------------------------------------");
        System.out.println("memory allocation of original and cloned object");
        System.out.println(original.hashCode());
        // clone object
        System.out.println(copy1.hashCode());

    }

}
