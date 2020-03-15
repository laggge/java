package ru.geekbrains.lesson_4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Staff[] staffArray = new Staff[5];

        staffArray[0] = new Staff("Alexey", 45000, 36, "storekeeper");

        staffArray[1] = new Staff("Nikolay", 45000, 47, "storekeeper");

        staffArray[2] = new Staff("Vasiliy", 45000, 39, "storekeeper");

        staffArray[3] = new Staff("Maxim", 45000, 44, "storekeeper");

        staffArray[4] = new Staff("Vladimir", 65000, 51, "manager");


      /* System.out.println(staffArray[0].getName() + " " + staffArray[0].getPosition());
       System.out.println(staffArray[1].getName() + " " + staffArray[1].getPosition());
       System.out.println(staffArray[2].getName() + " " + staffArray[2].getPosition());
       System.out.println(staffArray[3].getName() + " " + staffArray[3].getPosition());
       System.out.println(staffArray[4].getName() + " " + staffArray[4].getPosition());
      */

        staffInfo(staffArray);

        staffIncrease(staffArray);


    }

    public static void staffInfo(Staff[] staffArray) {
        staffArray[0].staffInfo();
        staffArray[1].staffInfo();
        staffArray[2].staffInfo();
        staffArray[3].staffInfo();
        staffArray[4].staffInfo();
    }

    public static void staffIncrease(Staff[] staffArray) {
        staffArray[0].staffIncrease();
        staffArray[1].staffIncrease();
        staffArray[2].staffIncrease();
        staffArray[3].staffIncrease();
        staffArray[4].staffIncrease();
    }
}
