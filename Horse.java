package ru.geekbrains.lesson_5;

public class Horse extends Animal {

    public Horse (int sprintDist, int swimDist, float jumpDist) {
        super(sprintDist, swimDist, jumpDist);
    }


    public void sprint(int distance) {
        System.out.println(distance <= maxSprint ? "Лошадка пробежала" : "Лошадка не пробежала");
    }


    public void swim(double swim) {
        System.out.println(swim <= maxSwim ? "Лошадка проплыла" : "Лошадка не проплыла");
    }

    public void jump(float jump) {
        System.out.println(jump <= maxJump ? "Лошадка перепрыгнула" : "Лошадка не перепрыгнула");
    }
}
