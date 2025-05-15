package ru.tseytwa.cqrs.main;

public interface Details {
    public String getOrderId();
    public String getProduct();
    public int getQuantity() ;
    public String getStatus();
}
