package ru.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Поезд движется по рельсам");
    }

    @Override
    public void stop() {
        System.out.println("Поезд останавливается на станции");
    }
}
