package ru.tseytwa.cqrs.main;

import java.util.List;

public class CreateOrderHandler {

    private IOrderRepository repository;
    private List<IEventListener> listeners;

    public CreateOrderHandler(IOrderRepository repository, List<IEventListener> listeners) {
        this.repository = repository;
        this.listeners = listeners;
    }

    public void handle(CreateOrderCommand command) {
        // Создаем заказ
        WriteOrderDetails order = new WriteOrderDetails(command.orderId, command.product, command.quantity, "Created",200);
        repository.save(order);
        // Создаем событие
        OrderCreatedEvent event = new OrderCreatedEvent(command.orderId, command.product, command.quantity);
        // Рассылаем событие подписчикам
        for (IEventListener listener : listeners) {
            listener.handle(event);
        }
    }
}
