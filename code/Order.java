package code;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int id;
    private int count;
    private double totalPrice;
    private double shippingCost;
    private List<OrderObserver> observers;
    private boolean discount;

    public Order(int id) {
        this.id = id;
        this.count = 0;
        this.totalPrice = 0.0;
        this.shippingCost = 10.0;
        this.discount = false;
        this.observers = new ArrayList<>();
    }

    public void addItem(double price) {
        this.count++;
        this.totalPrice += price;
        notifyObserver();
    }

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }

    public int getCount() {
        return count;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public boolean hasDiscount() {
        return this.discount;
    }

    public void setTotalPrice(double price) {
        this.totalPrice = price;
    }

    public void setShippingCost(double cost) {
        this.shippingCost = cost;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Order #" + id
                + "\n - number of Items: " + count
                + "\n Total: " + totalPrice
                + "$\n Shipping: " + shippingCost
                + "$\n Discount applied: " + (discount ? "Yes" : "No");
    }
}
