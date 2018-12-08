package challenges.food2door;

public class ExtraFoodShop implements Producer {

    @Override
    public boolean process(Order order) {
        System.out.println(order.getProductQuantity() + " " + order.getProduct()
                + " from \"ExtraFoodShop\" is prepared.");
        return true;
    }
}
