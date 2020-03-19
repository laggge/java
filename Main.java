package ru.geekbrains.lesson_5;

public class Main {

    public static void main(String[] args) {
        Dog d = new Dog(500, 10, 0.5f);
        Dog d2 = new Dog(600, 10, 0.5f);
        Dog d3 = new Dog(400, 10, 0.5f);
        Horse h = new Horse(1500, 100, 3);
        Bird b =  new Bird(5, 0, 0.2f);
        Cat c = new Cat(200, 0, 2);}

    Animal[] zoo = {d, d2, d3, h, b, c};
        for (int i = 0; i < zoo.length; i++){
        zoo[i].sprint();
        zoo[i].swim();
        zoo[i].jump();
        System.out.println(zoo[i].getClass().getName());
    }



}
