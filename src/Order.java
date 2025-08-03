import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Order {


    String orderId;
    String customerId;
    LocalDate orderDate;

    Order(String orderId,String customerId,LocalDate orderDate)
    {
        this.orderId=orderId;
        this.customerId=customerId;
        this.orderDate=orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }
    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();
        orders.add(new Order("ORD123", "CUST123", LocalDate.of(2025, 07, 07)));
        orders.add(new Order("ORD456", "CUST456", LocalDate.of(2025, 07, 04)));
        orders.add(new Order("ORD800", "CUST800", LocalDate.of(2025, 07, 03)));
        orders.add(new Order("ORD456", "CUST799", LocalDate.of(2025, 07, 02)));
        orders.add(new Order("ORD234", "CUST354", LocalDate.of(2025, 07, 5)));

        Comparator<Order> orderComparator = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o1.orderDate.compareTo(o2.orderDate);
            }
        };
        Collections.sort(orders, orderComparator);

        for (Order Ordersdata : orders) {
            System.out.println(Ordersdata);
        }


    }
}
