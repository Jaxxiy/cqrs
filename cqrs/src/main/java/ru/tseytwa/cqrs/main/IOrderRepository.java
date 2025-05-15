package ru.tseytwa.cqrs.main;

public interface IOrderRepository {
    void save(Details order);
    Details findById(String orderId);
}
