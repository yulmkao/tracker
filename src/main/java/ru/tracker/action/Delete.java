package ru.tracker.action;

import ru.tracker.input.Input;
import ru.tracker.output.Output;
import ru.tracker.Tracker;

public class Delete implements UserAction {
    private final Output output;

    public Delete(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Удалить заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Удаление заявки ===");
        int id = input.askInt("Введите ID заявки для удаления: ");
        if (tracker.findById(id) != null) {
            tracker.delete(id);
            output.println("Заявка успешно удалена.");
        } else {
            output.println("Ошибка. Заявки с ID " + id + " не существует.");
        }
        return true;
    }
}
