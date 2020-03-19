package ru.geekbrains.lesson_5;

public  class Animal {

    public int maxSprint;
    public int maxSwim;
    public float maxJump;

    public Animal(int maxSprint, int maxSwim, float maxJump) {
        this.maxSprint = maxSprint;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;

    }

    public void sprint(double sprintDist) {
        System.out.println(" Sprint " + (sprintDist <= maxSprint));

    }
    public void swim(int swimDist) {
        System.out.println(" Swim " + (swimDist <= maxSwim));

    }

    public void jump(int jumpDist) {
        System.out.println(" Jump " + (jumpDist <= maxJump));

    }

}