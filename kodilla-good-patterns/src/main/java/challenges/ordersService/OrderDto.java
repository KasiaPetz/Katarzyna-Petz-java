package challenges.ordersService;

public class OrderDto {
    public User user;
    public boolean isCompleted;

    public OrderDto(User user, boolean isCompleted) {
        this.user = user;
        this.isCompleted = isCompleted;
    }

    public User getUser() {
        return user;
    }

    public boolean isCompleted() {
        return isCompleted;
    }
}
