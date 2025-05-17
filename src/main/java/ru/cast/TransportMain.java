package ru.cast;

public class TransportMain {
    public static void main(String[] args) {
        Plane plane = new Plane();
        Train train = new Train();
        Bus bus = new Bus();
        Vehicle[] vehicles = new Vehicle[]{plane, train, bus};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            vehicle.stop();
        }
    }
}
