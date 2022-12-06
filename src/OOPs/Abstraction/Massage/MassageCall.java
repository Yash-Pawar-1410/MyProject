package OOPs.Abstraction.Massage;

public class MassageCall extends MassageInput {

    @Override
    void massage(String msg) {
        System.out.println("override the method massage");
    }



    public static void main(String[] args) {
        MassageCall massageCall = new MassageCall();
        massageCall.massage("Hello yash how are you");


    }
}
