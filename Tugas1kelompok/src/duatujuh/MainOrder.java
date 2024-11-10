package duatujuh;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class CustomerOrder {
    private String orderId;
    private String customerName;
    private LocalDate orderDate;

    public CustomerOrder(String orderId, String customerName, LocalDate orderDate) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderDate = orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "CustomerOrder{" +
                "orderId='" + orderId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }
}

class OnlineOrder extends CustomerOrder {
    private String shippingAddress;
    private String trackingNumber;
    private String trackingStatus;

    public OnlineOrder(String orderId, String customerName, LocalDate orderDate,
                       String shippingAddress, String trackingNumber) {
        super(orderId, customerName, orderDate);
        this.shippingAddress = shippingAddress;
        this.trackingNumber = trackingNumber;
        this.trackingStatus = "Pending"; // Default status
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public String getTrackingStatus() {
        return trackingStatus;
    }

    public void updateTrackingStatus(String status) {
        this.trackingStatus = status;
    }

    public long calculateShippingTime(LocalDate deliveryDate) {
        return ChronoUnit.DAYS.between(getOrderDate(), deliveryDate);
    }

    @Override
    public String toString() {
        return "OnlineOrder{" +
                "orderId='" + getOrderId() + '\'' +
                ", customerName='" + getCustomerName() + '\'' +
                ", orderDate=" + getOrderDate() +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", trackingNumber='" + trackingNumber + '\'' +
                ", trackingStatus='" + trackingStatus + '\'' +
                '}';
    }
}

public class MainOrder {
    public static void main(String[] args) {
        OnlineOrder order = new OnlineOrder("ORD123", "John Doe", LocalDate.now(),
                "123 Main St, Anytown, USA", "TRACK456");

        System.out.println(order);

        // Update tracking status
        order.updateTrackingStatus("Shipped");
        System.out.println("Updated Tracking Status: " + order.getTrackingStatus());

        // Calculate shipping time
        long shippingTime = order.calculateShippingTime(LocalDate.now().plusDays(5)); // Assume delivery in 5 days
        System.out.println("Shipping time (in days): " + shippingTime);
    }
}