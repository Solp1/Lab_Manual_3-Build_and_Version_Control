package code;

import java.util.List;

public class Order {

    private int id;
    private int count;
    private double totalPrice;
    private double shippingCost;
    private List<OrderObserver> observers;
    private boolean discount;

    public Order(int id) {
        // constructor
    }

    public void addItem(double price) {
        // not yet implemented
    }

    public void attach(OrderObserver observer) {
        // not yet implemented
    }

    public void detach(OrderObserver observer) {
        // not yet implemented
    }

    public void notifyObserver() {
        // not yet implemented
    }

    public int getCount() {
        return count;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double price) {
        // not yet implemented
    }

    public void setShippingCost(double cost) {
        // not yet implemented
    }

    @Override
    public String toString() {
        return null;
    }
}
