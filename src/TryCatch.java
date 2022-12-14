public class TryCatch {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            String str = null;
            System.out.println(str.length());
        }
        //catch block is a custom exception handler
        catch (NullPointerException nullPointerException) {
            System.out.println("NPE developer written exception handler");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("AE developer written exception handler");
        }

        System.out.println("rest of the code");
    }
}

