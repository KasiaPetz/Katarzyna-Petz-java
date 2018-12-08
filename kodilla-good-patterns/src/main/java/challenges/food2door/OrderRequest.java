package challenges.food2door;

public class OrderRequest {
    private String producerName;
    private Order order;

    public OrderRequest(String producerName, Order order) {
        this.producerName = producerName;
        this.order = order;
    }

    public String getProducerName() {
        return producerName;
    }

    public Order getOrder() {
        return order;
    }
}
