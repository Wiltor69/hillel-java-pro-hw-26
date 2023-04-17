package ua.hillel;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("orders")
public class OrderRepository {
    @Inject
    private OrderService orderService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Order> getOrders() {
        return orderService.getAllOrders();
    }
    @GET
    @Path("/{id}")
    public Order getOrderById(@PathParam("id") int id){
        return orderService.getOrderById(id);
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addByOrder(Order order){
        orderService.addOrder(order);
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateByOrder(@PathParam("id") int id, Order order){
        orderService.updateOrder(id,order);
    }

    @DELETE
    @Path("/{id}")
    public void deleteByOrder(@PathParam("id") int id)  {
        orderService.deleteOrder(id);
    }

}
