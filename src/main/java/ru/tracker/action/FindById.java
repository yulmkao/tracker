package ru.tracker.action;

import ru.tracker.*;

public class FindById implements UserAction {
    private final Output output;

    public FindById(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Показать заявку по id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Поиск заявки по ID ===");
        int id = input.askInt("Введите ID: ");
        Item item = tracker.findById(id);
        if (item != null) {
            output.println("Заявка успешно найдена: " + item);
        } else {
            output.println("Ошибка. Заявки с ID " + id + " не существует.");
        }
        return true;
    }
}