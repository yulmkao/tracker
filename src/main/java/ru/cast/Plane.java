package ru.cast;

public class Plane implements Vehicle {

    @Override
    public void move() {
        System.out.println("Самолёт летит по воздуху");
    }

    @Override
    public void stop() {
        System.out.println("Самолет заходит на посадку в аэропорт");
    }
}
