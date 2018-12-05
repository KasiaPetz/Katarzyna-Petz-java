package challenges.ordersService;

import java.time.LocalDateTime;

public interface OrderService {
    boolean completeOrder(User user, LocalDateTime orderDate, Product product);
}
