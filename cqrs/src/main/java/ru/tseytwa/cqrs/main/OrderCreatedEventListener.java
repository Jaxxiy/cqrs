package ru.tseytwa.cqrs.main;

public class OrderCreatedEventListener implements IEventListener {

    private IOrderRepository repository;

    public OrderCreatedEventListener(IOrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public void handle(IEvent event) {
        if (event instanceof OrderCreatedEvent) {
            OrderCreatedEvent e = (OrderCreatedEvent) event;
            // Обновляем модель для чтения
            OrderDetails order = new OrderDetails(e.orderId, e.product, e.quantity, "Confirmed");
            repository.save(order);
        }
    }
}
