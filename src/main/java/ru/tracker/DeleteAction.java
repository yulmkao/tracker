package ru.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Удалить заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Удаление заявки ===");
        int id = input.askInt("Введите ID заявки для удаления: ");
        if (tracker.findById(id) != null) {
            tracker.delete(id);
            System.out.println("Заявка успешно удалена.");
        } else {
            System.out.println("Ошибка. Заявки с ID " + id + " не существует.");
        }
        return true;
    }
}
