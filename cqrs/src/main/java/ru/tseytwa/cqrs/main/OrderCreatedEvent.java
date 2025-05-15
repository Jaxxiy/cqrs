package ru.tseytwa.cqrs.main;

public class OrderCreatedEvent implements IEvent{
    public String orderId;
    public String product;
    public int quantity;

    public OrderCreatedEvent(String orderId, String product, int quantity) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
    }
}
