package challenges.food2door;

public class OrderProcessor {
    private Producer producer;
    private Order order;

    public OrderProcessor(final Producer producer, final Order order) {
        this.producer = producer;
        this.order = order;
    }
    public OrderDto processOrder(OrderRequest orderRequest) {
        if (producer.equals("GlutenFreeShop")) {
            Producer producer = new GlutenFreeShop();
        } else if (producer.equals("ExtraFoodShop")) {
            Producer producer = new ExtraFoodShop();
        } else if (producer.equals("HealthyShop")) {
            Producer producer = new HealthyShop();
        }
        boolean isComplited = producer.process(order);
        if (isComplited) {
            return new  OrderDto(orderRequest.getOrder().getOrderId(), true);
        } else {
            return new OrderDto(orderRequest.getOrder().getOrderId(), false);
        }
    }
}
