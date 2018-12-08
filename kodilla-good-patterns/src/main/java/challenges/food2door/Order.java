package challenges.food2door;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Order {
    private int orderId;
    private LocalDate orderDate;
    private String product;
    private int productQuantity;

    public Order(int orderId, LocalDate orderDate, String product, int productQuantity) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.product = product;
        this.productQuantity = productQuantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getProduct() {
        return product;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
