package challenges.food2door;

public class OrderDto {
    public int orderId ;
    public boolean isComplited;

    public OrderDto(int orderId, boolean isComplited) {
        this.orderId = orderId;
        this.isComplited = isComplited;
    }

    public int getOrderId() {
        return orderId;
    }

    public boolean isComplited() {
        return isComplited;
    }
}
