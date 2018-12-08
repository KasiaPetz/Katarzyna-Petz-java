package challenges.food2door;

public class HealthyShop implements Producer {

    @Override
    public boolean process(Order order) {
        System.out.println(order.getProductQuantity() + " " + order.getProduct()
                + " from \"HealthyShop\" is prepared.");
        return true;
    }
}
