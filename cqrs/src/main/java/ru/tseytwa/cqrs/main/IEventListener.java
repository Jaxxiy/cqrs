package ru.tseytwa.cqrs.main;

public interface IEventListener {
    void handle(IEvent event);
}
