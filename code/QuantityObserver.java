package code;

public class QuantityObserver implements OrderObserver {

    @Override
    public void update(Order order) {
        shippingCost(order);
    }

    private void shippingCost(Order order) {
        if (order.getCount() > 5) {
            order.setShippingCost(0);
        } else {
            return;
        }
    }
}
