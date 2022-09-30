package Class_Component;

/*  Q   where it is created
    =>  inside the method, constructor, block
    Q   why we use
    =>  to store temporary calculation
    Q   where they get the memory
    =>  in the stack memory area
    Q   how do we access them
    =>  directly inside the method, constructor, block
    Q   when they get the memory
    =>  when method, constructor, block is called
    Q   when variable are deleted
    =>  after the execution of the method, constructor,block is completed
    Q   how many times get the memory
    =>  every time method is called
    Q   default value
    =>  no
    Q   do we need object to be created to access them
    => no


 */

public class LocalVariable {
    public static void main(String[] args) {
        byte byt=10;
        System.out.println(byt);

        short sh=23;
        System.out.println(sh);

          int in=1313;
        System.out.println(in);

        long lg=489565L;
        System.out.println(lg);

        float fl=2.236f;
        System.out.println(fl);

        double db=32.15454d;
        System.out.println(db);

        char ch='a';
        System.out.println(ch);


    }
}
