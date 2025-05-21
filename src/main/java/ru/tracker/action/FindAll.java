package ru.tracker.action;

import ru.tracker.*;
import ru.tracker.input.Input;
import ru.tracker.output.Output;

public class FindAll implements UserAction {
    private final Output output;

    public FindAll(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Показать все заявки";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Вывод всех заявок ===");
        Item[] items = tracker.findAll();
        if (items.length == 0) {
            output.println("Хранилище еще не содержит заявок");
        } else {
            for (Item item : items) {
                output.println(item);
            }
        }
        return true;
    }
}