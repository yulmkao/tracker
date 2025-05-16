package ru.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (1 <= matches && matches <= 3 && count >= matches) {
                count -= matches;
                System.out.println("Спичек осталось: " + count);
                if (count == 0) {
                    System.out.println(player + " победил");
                } else {
                    System.out.println("Передаем ход другому игроку");
                    turn = !turn;
                }
            } else {
                System.out.println("Ошибка. Введите число повторно");
            }
        }
    }
}
