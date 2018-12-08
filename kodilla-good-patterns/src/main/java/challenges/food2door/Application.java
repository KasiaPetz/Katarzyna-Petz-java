package challenges.food2door;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        Order order = new Order(11, LocalDate.of(2018, 12, 8),
                "eggs", 20);
        OrderRequest orderRequest = new OrderRequest("ExtraFoodShop", order);
        OrderProcessor orderProcessor1 = new OrderProcessor();

        orderProcessor1.processOrder(orderRequest);
    }
}
