package ru.tseytwa.cqrs.main;

import java.util.HashMap;
import java.util.Map;

public class InMemoryOrderRepository implements IOrderRepository {
    private Map<String, Details> storage = new HashMap<>();

    @Override
    public void save(Details order) {
        storage.put(order.getOrderId(), order);
    }

    @Override
    public Details findById(String orderId) {
        return storage.get(orderId);
    }

}
