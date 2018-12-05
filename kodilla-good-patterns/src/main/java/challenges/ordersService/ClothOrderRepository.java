package challenges.ordersService;

import java.time.LocalDateTime;

public class ClothOrderRepository implements OrderRepository {
    @Override
    public boolean createOrder(User user, LocalDateTime orderDate, Product product) {
        System.out.println("Saving order to database...");
        return true;
    }
}
