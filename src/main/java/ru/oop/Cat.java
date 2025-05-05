package ru.oop;

public class Cat {

    private String food;

    private String name;

    public void show() {
        System.out.println("Кота зовут: " + this.name);
        System.out.println("Кот ест: " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("Gavgav");
        gav.eat("kotleta");
        gav.show();
        Cat black = new Cat();
        black.giveNick("Blackie");
        black.eat("fish");
        black.show();
    }
}
