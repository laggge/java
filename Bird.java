package ru.geekbrains.lesson_5;

public class Bird extends Animal {

    public Bird (int sprintDist, int swimDist, float jumpDist) {

        super(sprintDist, swimDist, jumpDist);
    }


    public void sprint(int distance) {
        System.out.println(distance <= maxSprint ? "Птичка пробежала" : "Птичка не пробежала");
    }


    public void swim(double swim) {
        System.out.println(swim <= maxSwim ? "Птичка еле еле доплыла" : "Птичка не доплыла!");
    }

    public void jump(float jump) {
        System.out.println(jump <= maxJump ? "Птичка перепрыгнула" : "Птичка не перепрыгнула");
    }
}
