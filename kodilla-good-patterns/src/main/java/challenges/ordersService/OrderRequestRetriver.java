package challenges.ordersService;

import java.time.LocalDateTime;

public class OrderRequestRetriver {

    public OrderRequest retrieve() {
        User user = new User("John", "Nowak", "Wroclaw");
        LocalDateTime orderDate = LocalDateTime.of(2018, 12, 5, 12,0);
        Product product = new Product("Shirt");

        return new OrderRequest(user, orderDate, product);
    }
}
