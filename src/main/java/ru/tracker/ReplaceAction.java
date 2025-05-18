package ru.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "Изменить заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Редактирование заявки ===");
        int id = input.askInt("Введите ID заявки для редактирования: ");
        String newName = input.askStr("Введите новое имя: ");
        Item newItem = new Item(newName);
        if (tracker.replace(id, newItem)) {
            System.out.println("Заявка успешно изменена.");
        } else {
            System.out.println("Ошибка. Заявки с ID " + id + " не существует.");
        }
        return true;
    }
}
