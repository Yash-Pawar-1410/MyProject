package ExceptionHandling.CustomException;

public class InvalidDivisiorException extends RuntimeException {
    public  InvalidDivisiorException(){
        super();
    }
    public InvalidDivisiorException(String message){
        super(message);
    }
}
