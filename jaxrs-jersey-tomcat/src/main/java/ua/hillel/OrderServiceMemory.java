package ua.hillel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderServiceMemory implements OrderService{
    private List<Order> orders = new ArrayList<>() {{
        add(new Order(1,new Product(1,234.76,"Video"), 234.76,
                LocalDate.of(2023,3,11)));

        add(new Order(2,new Product(3,129.11,"Photo"), 129.11,
                LocalDate.of(2023,2,14)));

        add(new Order(3,new Product(2,578.45,"Computer"), 578.45,
                LocalDate.of(2023,1,22)));

    }};
    @Override
    public List<Order> getAllOrders() {
        return orders;
    }

    @Override
    public Order getOrderById(int id) {
         return orders.stream()
                 .filter(u -> u.getId() == id)
                 .findFirst()
                 .get();
    }

    @Override
    public void addOrder(Order order) {
        orders.add(order);

    }

    @Override
    public void updateOrder(int id, Order order) {
    Order exitOrder = orders.stream()
            .filter(u -> u.getId() == id)
            .findFirst()
            .get();
    if(exitOrder != null){
        exitOrder.setProduct(order.getProduct());
    }
    }

    @Override
    public void deleteOrder(int id) {
        orders.removeIf(u -> u.getId() == id);
    }
}
