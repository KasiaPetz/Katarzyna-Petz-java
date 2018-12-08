package challenges.food2door;

public class GlutenFreeShop implements Producer {

    @Override
    public boolean process(Order order) {
        System.out.println(order.getProductQuantity() + " " + order.getProduct()
                + " from \"GlutenFreeShop\" is prepared.");
        return true;
    }
}
