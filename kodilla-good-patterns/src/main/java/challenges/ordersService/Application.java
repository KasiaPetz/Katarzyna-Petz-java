package challenges.ordersService;

public class Application {
    public static void main(String[] args) {

        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new SmsService(),
                new ClothOrderService(), new ClothOrderRepository());

        productOrderService.process(orderRequest);
    }
}
