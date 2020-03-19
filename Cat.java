package ru.geekbrains.lesson_5;

public class Cat extends Animal {

    public Cat (int sprintDist, int swimDist, float jumpDist) {
        super(sprintDist, swimDist, jumpDist);
    }


    public void sprint(int distance) {
       System.out.println(distance <= maxSprint ? "Котик пробежал" : "Котик не пробежал");
   }


    public void swim(double swim) {
        System.out.println(swim <= maxSwim ? "Котик еле еле доплыл" : "Котик не  доплыл!");
    }

    public void jump(float jump) {
        System.out.println(jump <= maxJump ? "Котик перепрыгнул" : "Котик не перепрыгнул");
    }

}
