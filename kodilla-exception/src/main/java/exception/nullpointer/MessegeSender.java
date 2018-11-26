package exception.nullpointer;

public class MessegeSender {
    public void sendMessegeTo(User user, String message) throws MessageNotSendException {
        if (user != null) {
            System.out.println("Sending message: " + message + " to " + user.getName());
        } else {
            throw new MessageNotSendException("Object User was null");
        }
    }
}

