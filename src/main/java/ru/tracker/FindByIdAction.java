package ru.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "Показать заявку по id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Поиск заявки по ID ===");
        int id = input.askInt("Введите ID: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Заявка успешно найдена: " + item);
        } else {
            System.out.println("Ошибка. Заявки с ID " + id + " не существует.");
        }
        return true;
    }
}
