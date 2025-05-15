package ru.tseytwa.cqrs.main;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        IOrderRepository repository = new InMemoryOrderRepository();
        IOrderRepository writeRepository = new WriteRepository();

        List<IEventListener> listeners = new ArrayList<>();
        listeners.add(new OrderCreatedEventListener(writeRepository));

        //отвечает за запись
        CreateOrderHandler handler = new CreateOrderHandler(writeRepository, listeners);
        CommandController commandController = new CommandController(handler,repository);
        //отвечает за чтение
        QueryController queryController = new QueryController(repository);

        commandController.createOrder("123", "Laptop", 2,200);
        Details orderDetails = repository.findById("123");
        System.out.println(orderDetails);

    }
}
