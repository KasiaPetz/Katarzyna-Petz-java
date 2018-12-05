package challenges.ordersService;

import java.time.LocalDateTime;

public class ClothOrderService implements OrderService{
    @Override
    public boolean completeOrder(User user, LocalDateTime orderDate, Product product) {
        System.out.println("Create order for " + user.getName() + " " + user.getSurname()
                                + "\nAddress : " + user.getAddress()
                                + "\nProduct : " + product.getName()
                                + "\nDate of order : " + orderDate.toString());
        return true;
    }
}
