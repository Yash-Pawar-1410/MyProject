package Functional_Interface.Assignment_1;

public class DataInputStream implements InputStreamOpener {

    @Override

    public String open(String string) {
        return string;
    }

    public static void main(String[] args) {
        InputStreamOpener c=new DataInputStream();
        System.out.println(c.open("this is a Data Input Stream first way"));
        //----------------------------------------------------------------------------
        InputStreamOpener c1=new InputStreamOpener() {
            @Override
            public String open(String string) {
                return string;
            }
        };
        System.out.println(c1.open("this is a Data Input Stream second way"));
        //-----------------------------------------------------------------------------------
        InputStreamOpener lambda=(string)->string;
        System.out.println(lambda.open("this is a Data Input Stream third way"));
    }
}
