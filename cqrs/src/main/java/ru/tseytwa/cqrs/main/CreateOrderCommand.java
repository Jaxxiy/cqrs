package ru.tseytwa.cqrs.main;

public class CreateOrderCommand implements ICommand{
    public String orderId;
    public String product;
    public int quantity;

    public CreateOrderCommand(String orderId, String product, int quantity) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
    }
}
