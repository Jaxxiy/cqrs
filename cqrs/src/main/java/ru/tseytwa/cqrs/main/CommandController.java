package ru.tseytwa.cqrs.main;

public class CommandController {
    private CreateOrderHandler createOrderHandler;
    private IOrderRepository orderRepository;

    public CommandController(CreateOrderHandler handler, IOrderRepository orderRepository) {
        this.createOrderHandler = handler;
        this.orderRepository = orderRepository;
    }

    public void createOrder(String orderId, String product, int quantity, int sum) {
        CreateOrderCommand command = new CreateOrderCommand(orderId, product, quantity);
        WriteOrderDetails writeOrderDetails = new WriteOrderDetails(orderId,product,quantity,"200",sum);
        orderRepository.save(writeOrderDetails);
        createOrderHandler.handle(command);
    }
}
