package ru.oop;

public class Jukebox {

    public void music(int position) {
        switch (position) {
            case 1:
                System.out.println("Пусть бегут неуклюже");
                break;
            case 2:
                System.out.println("Спокойной ночи");
                break;
            default:
                System.out.println("Песня не найдена");
                break;
        }
    }

    public static void main(String[] args) {
        Jukebox musicBox = new Jukebox();
        int position = 1;
        musicBox.music(position);
        position = 2;
        musicBox.music(position);
        position = 3;
        musicBox.music(position);
    }
}
