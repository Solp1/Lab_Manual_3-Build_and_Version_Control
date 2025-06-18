package code;

public class Client {

    public static void main(String[] args) {
        int randId = ((int) (Math.random() * 10000) + 1);
        int randPrice = ((int) (Math.random() * 100) + 1);
        Order order = new Order(randId);

        OrderObserver priceObserver = new PriceObserver();
        OrderObserver quantityObserver = new QuantityObserver();

        order.attach(priceObserver);
        order.attach(quantityObserver);

        for (int i = 0; i < 4; i++) {
            order.addItem(randPrice);
        }

        System.out.println(order);

        for (int i = 0; i < 2; i++) {
            order.addItem(randPrice);
        }

        System.out.println(order);
    }
}
