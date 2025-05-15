package ru.tseytwa.cqrs.main;

public class QueryController {
    private IOrderRepository repository;

    public QueryController(IOrderRepository repository) {
        this.repository = repository;
    }

    public OrderDetails getOrderDetails(String orderId) {
        return (OrderDetails) repository.findById(orderId);
    }
}
