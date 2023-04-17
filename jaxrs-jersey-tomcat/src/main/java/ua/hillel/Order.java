package ua.hillel;

import java.time.LocalDate;
import java.util.Date;

public class Order {
    private int id;
    private Product product;
    private double cost;
    private LocalDate date;

    public Order(int id, Product product, double cost, LocalDate date) {
        this.id = id;
        this.product = product;
        this.cost = cost;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
