package ru.tracker;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Создание новой заявки ===");
        String name = input.askStr("Введите имя: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Добавленная заявка: " + item);
    }

    public static void findAllItems(Input input, Tracker tracker) {
        System.out.println("=== Вывод всех заявок ===");
        Item[] items = tracker.findAll();
        if (items.length == 0) {
            System.out.println("Хранилище еще не содержит заявок");
        } else {
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Редактирование заявки ===");
        int id = input.askInt("Введите ID заявки для редактирования: ");
        String newName = input.askStr("Введите новое имя: ");
        Item newItem = new Item(newName);
        if (tracker.replace(id, newItem)) {
            System.out.println("Заявка успешно изменена.");
        } else {
            System.out.println("Ошибка. Заявки с ID " + id + " не существует.");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Удаление заявки ===");
        int id = input.askInt("Введите ID заявки для удаления: ");
        if (tracker.findById(id) != null) {
            tracker.delete(id);
            System.out.println("Заявка успешно удалена.");
        } else {
            System.out.println("Ошибка. Заявки с ID " + id + " не существует.");
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Поиск заявки по ID ===");
        int id = input.askInt("Введите ID: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Заявка успешно найдена: " + item);
        } else {
            System.out.println("Ошибка. Заявки с ID " + id + " не существует.");
        }
    }

    public static void findItemByName(Input input, Tracker tracker) {
        System.out.println("=== Поиск заявки по имени ===");
        String name = input.askStr("Введите имя: ");
        Item[] item = tracker.findByName(name);
        if (item.length > 0) {
            for (Item items : item) {
                System.out.println(items);
            }
        } else {
            System.out.println("Ошибка. Заявок с именем " + name + " не существует.");
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            int select = input.askInt("Выбрать: ");
            if (select == 0) {
                createItem(input, tracker);
            } else if (select == 1) {
                findAllItems(input, tracker);
            } else if (select == 2) {
                replaceItem(input, tracker);
            } else if (select == 3) {
                deleteItem(input, tracker);
            } else if (select == 4) {
                findItemById(input, tracker);
            } else if (select == 5) {
                findItemByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    public void showMenu() {
        String[] menu = {
                "Добавить новую заявку", "Показать все заявки", "Изменить заявку",
                "Удалить заявку", "Показать заявку по id", "Показать заявки по имени", "Завершить программу"
        };
        System.out.println("Меню: ");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
