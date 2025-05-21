package ru.tracker.action;

import ru.tracker.*;
import ru.tracker.input.Input;
import ru.tracker.output.Output;

public class Replace implements UserAction {
    private final Output output;

    public Replace(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Изменить заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Редактирование заявки ===");
        int id = input.askInt("Введите ID заявки для редактирования: ");
        String newName = input.askStr("Введите новое имя: ");
        Item newItem = new Item(newName);
        if (tracker.replace(id, newItem)) {
            output.println("Заявка успешно изменена.");
        } else {
            output.println("Ошибка. Заявки с ID " + id + " не существует.");
        }
        return true;
    }
}