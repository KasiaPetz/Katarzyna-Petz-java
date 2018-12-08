package challenges.food2door;

public class OrderProcessor {

    public OrderDto processOrder(OrderRequest orderRequest) {
        Producer producer = null;
        if (orderRequest.getProducerName().equals("GlutenFreeShop")) {
             producer = new GlutenFreeShop();
        } else if (orderRequest.getProducerName().equals("ExtraFoodShop")) {
             producer = new ExtraFoodShop();
        } else if (orderRequest.getProducerName().equals("HealthyShop")) {
            producer = new HealthyShop();
        }
        boolean isComplited = producer.process(orderRequest.getOrder());
        if (isComplited) {
            return new  OrderDto(orderRequest.getOrder().getOrderId(), true);
        } else {
            return new OrderDto(orderRequest.getOrder().getOrderId(), false);
        }
    }
}
