package Interface.Message;

public class MessageCall implements MessageService{

    @Override
    public void message() {
        System.out.println("This interface method overriding");
    }

    public static void main(String[] args) {
        // if we try to create object of the Parent class reference and parent class object then it creates anonymous class
        // child class reference child class onject
        MessageCall messageCall=new MessageCall();
        messageCall.message();
        // parent class reference and child class object
        MessageService messageService=new MessageCall();
        messageService.message();
    }
}
