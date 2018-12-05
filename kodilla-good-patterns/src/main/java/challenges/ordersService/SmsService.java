package challenges.ordersService;

public class SmsService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Sending sms to : " + user.getName());
    }
}
