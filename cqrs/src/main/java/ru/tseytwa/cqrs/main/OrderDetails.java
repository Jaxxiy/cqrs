package ru.tseytwa.cqrs.main;

public class OrderDetails implements Details{
    private String orderId;
    private String product;
    private int quantity;
    private String status;

    public OrderDetails(String orderId, String product, int quantity, String status) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
        this.status = status;
    }

    public String getOrderId() { return orderId; }
    public String getProduct() { return product; }
    public int getQuantity() { return quantity; }
    public String getStatus() { return status; }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "orderId='" + orderId + '\'' +
                ", product='" + product + '\'' +
                ", quantity=" + quantity +
                ", status='" + status + '\'' +
                '}';
    }
}
