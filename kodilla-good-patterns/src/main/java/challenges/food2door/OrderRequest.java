package challenges.food2door;

public class OrderRequest {
    private Producer producer;
    private Order order;

    public OrderRequest(Producer producer, Order order) {
        this.producer = producer;
        this.order = order;
    }

    public Producer getProducer() {
        return producer;
    }

    public Order getOrder() {
        return order;
    }
}
