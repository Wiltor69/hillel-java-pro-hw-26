package ua.hillel;

import java.util.List;

public interface OrderService {
    List<Order> getAllOrders();
    Order getOrderById(int id);
    void addOrder(Order order);
    void updateOrder(int id, Order order);
    void deleteOrder(int id);

}
