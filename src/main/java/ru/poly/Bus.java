package ru.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("В автобусе " + passengers + " пассажиров");
    }

    @Override
    public int refill(int fuel) {
        int price = 50;
        return fuel * price;
    }
}
