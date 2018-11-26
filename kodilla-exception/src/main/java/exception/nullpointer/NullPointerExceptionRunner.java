package exception.nullpointer;

public class NullPointerExceptionRunner {
    public static void main(String[] args) {
        User user = null;
        MessegeSender messegeSender = new MessegeSender();

        try {
            messegeSender.sendMessegeTo(user, "Hello!");
        } catch (MessageNotSendException e) {
            System.out.println("Messege is not send," +
                    "but my program still running very well!");
        }
        System.out.println("Processing other logic!");
    }
}
