package ru.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.println("Выбрать: ");
            int select = Integer.parseInt((scanner.nextLine()));
            if (select == 0) {
                System.out.println("=== Создание новой заявки ===");
                System.out.println("Введите имя: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Добавленная заявка: " + item);
            } else if (select == 1) {
                System.out.println("=== Вывод всех заявок ===");
                Item[] items = tracker.findAll();
                if (items.length == 0) {
                    System.out.println("Хранилище еще не содержит заявок");
                } else {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                }
            } else if (select == 2) {
                System.out.println("=== Редактирование заявки ===");
                System.out.print("Введите ID заявки для редактирования: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("Введите новое имя: ");
                String newName = scanner.nextLine();
                Item newItem = new Item(newName);
                if (tracker.replace(id, newItem)) {
                    System.out.println("Заявка успешно изменена.");
                } else {
                    System.out.println("Ошибка. Заявки с ID " + id + " не существует.");
                }
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
