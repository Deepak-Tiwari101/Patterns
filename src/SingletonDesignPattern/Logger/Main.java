package SingletonDesignPattern.Logger;

import java.util.ArrayList;
import java.util.List;

class UserService {
    public void createUser(String username) {
        ILogger logger = SingletonLoggerManager.getInstance();
        logger.info("Creating user: " + username);
        logger.info("User: '" + username + "' created successfully");
    }
}

class OrderService {
    List<String> orders;

    public OrderService(List<String> orders) {
        this.orders = orders;
    }

    public void addOrder(String item) {
        orders.add(item);
    }
    public void placeOrder() {
        ILogger logger = SingletonLoggerManager.getInstance();
        logger.log("Order place, order summary: \n" + orders);
    }
}


public class Main {
    public static void main(String[] args) {
        UserService u1 = new UserService();
        u1.createUser("John");
        OrderService o1 = new OrderService(new ArrayList<>());
        o1.addOrder("Burgers");
        o1.addOrder("Pizza");
        o1.placeOrder();
    }
}
