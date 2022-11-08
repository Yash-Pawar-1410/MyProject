package Functional_Interface.Assignment_1;

public class BufferedInputStream implements InputStreamOpener{
    @Override
    public String open(String string) {
        return string;
    }

    public static void main(String[] args) {
        InputStreamOpener b=new BufferedInputStream();
        System.out.println(b.open("this is a Buffered Input Stream first way"));
        //---------------------------------------------------------------------------------
        InputStreamOpener b1=new InputStreamOpener() {
            @Override
            public String open(String string) {
                return string;
            }
        };
        System.out.println(b1.open("this is a Buffered Input Stream Second way"));
        //---------------------------------------------------------------------------------------
        InputStreamOpener lambda=(string)->string;
        System.out.println(lambda.open("this is a Buffered Input Stream third way"));
    }
}
