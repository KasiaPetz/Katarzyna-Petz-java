package challenges.food2door;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        Order order = new Order(11, LocalDate.of(2018, 12, 8),
                "eggs", 20);
        Producer exstraFoodShop = new ExtraFoodShop();
        OrderRequest orderRequest = new OrderRequest(exstraFoodShop, order);
        OrderProcessor orderProcessor1 = new OrderProcessor(exstraFoodShop, order);

        orderProcessor1.processOrder(orderRequest);
    }
}
