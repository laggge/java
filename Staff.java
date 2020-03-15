package ru.geekbrains.lesson_4;

public class Staff {

    private String name;
    private int salary;
    private int age;
    private String position;
    private static int bonus = 5000;

    public String getName(){
        return this.name;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public static int getBonus() {
        return bonus;
    }

    public int getAll(){
        return getSalary() + getBonus();
    }

    public void staffInfo(){
        if (this.getAge() < 40) return;
        System.out.println(this.getName() + " of age " + this.getAge() + " is " + this.getPosition() + " gets " + this.getSalary());
    }

    public void staffIncrease(){
        if (this.getAge() < 45) return;
        System.out.println(this.getName() + " of age " + this.getAge() + " is " + this.getPosition() + " gets " + this.getAll());
    }
    public Staff(String name, int salary, int age, String position){
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.position = position;



    }

}
