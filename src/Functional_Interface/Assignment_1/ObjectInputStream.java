package Functional_Interface.Assignment_1;

public class ObjectInputStream implements  InputStreamOpener{
    @Override
    public String open(String string) {
        return string;
    }

    public static void main(String[] args) {
        InputStreamOpener a=new ObjectInputStream();
        System.out.println(a.open("This is a Object Input Stream first way"));
        //---------------------------------------------------------------------------------------------
        InputStreamOpener a1=new InputStreamOpener() {
            @Override
            public String open(String string) {
                return string;
            }
        };
        System.out.println(a1.open("This is a Object Input Stream second way"));
        //-------------------------------------------------------------------------------------------
        InputStreamOpener lambda=(string)->string;
        System.out.println(lambda.open("This is a Object Input stream third way"));

    }
}
