package ru.geekbrains.lesson_5;

public class Dog extends Animal {

    public Dog (int sprintDist, int swimDist, float jumpDist) {

        super(sprintDist, swimDist, jumpDist);
    }


    public void sprint(int distance) {
        System.out.println(distance <= maxSprint ? "Песик пробежал" : "Песик не пробежал");
    }


    public void swim(double swim) {
        System.out.println(swim <= maxSwim ? "Песик проплыл" : "Песик не проплыл");
    }

    public void jump(float jump) {
        System.out.println(jump <= maxJump ? "Песик перепрыгнул" : "Песик не перепрыгнул");
    }
}
