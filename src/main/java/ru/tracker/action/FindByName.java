package ru.tracker.action;

import ru.tracker.*;
import ru.tracker.input.Input;
import ru.tracker.output.Output;

public class FindByName implements UserAction {
    private final Output output;

    public FindByName(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Показать заявки по имени";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Поиск заявки по имени ===");
        String name = input.askStr("Введите имя: ");
        Item[] item = tracker.findByName(name);
        if (item.length > 0) {
            for (Item items : item) {
                output.println(items);
            }
        } else {
            output.println("Ошибка. Заявок с именем " + name + " не существует.");
        }
        return true;
    }
}