package code;

public class PriceObserver implements OrderObserver {

    @Override
    public void update(Order order) {
        applyDiscount(order);
    }

    private void applyDiscount(Order order) {
        if ((order.getTotalPrice() > 200) && (order.hasDiscount() == false)) {
            order.setTotalPrice(order.getTotalPrice() - 20);
            order.setDiscount(true);
        }
    }
}
