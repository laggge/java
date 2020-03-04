package ru.geekbrains.java_1_lesson.a;

public class A {
    /**
    *quest 1
    *Создать пустой проект в IntelliJ IDEA и прописать метод main();
    */

    public static void main(String[] args) {

    };

    /**
     *quest 2
     *Создать переменные всех пройденных типов данных, и инициализировать их значения;
     */
    static void quest2 (){
        byte b = 123;
        short st = 12311;
        char ch = 'C';
        int integer = 22;
        long lg = 123123;
        float fl = 123.123f;
        double dl = 2323.23232;
        boolean bool = false;

    }

    /**
     *quest 3
     *Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
     *где a, b, c, d – входные параметры этого метода;
     */

    static double calc(double a, double b, double c, double d){
        return a * (b + (c / d));
    }

    /**
     *quest 4
     *Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
     *в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
     */

    static boolean range(int one, int four){
        int sum = one + four;
        int fieldMin = 9;
        int fieldMax = 21;

        return  sum > fieldMin && sum < fieldMax;
    }

    /**
     *quest 5
     *Написать метод, которому в качестве параметра передается целое число,
     *метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
     */

    static void printPosOrNeg (int number){
        String word = "Положительное";
        if (number < 0) word = "Отрицательное";

        System.out.println(word);
    }

    /**
     *quest 6
     *Написать метод, которому в качестве параметра передается целое число,
     *метод должен вернуть true, если число отрицательное;
     */

    static boolean ifNeg (int number){
        return number < 0;
    }

    /**
     *quest 7
     *Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести
     *в консоль сообщение «Привет, указанное_имя!»;
     */

    static void sayHello(String name){
        System.out.printf("Привет, %s!\n", name);
    }

    /**
     *quest 8
     *Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
     *Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */

    static void yearPrint(int year){
        if(leapY(year)){
            System.out.println("Високосный");
        } else {
            System.out.println("Не Високосный");
        }
    }

    private static boolean leapY (int year){
        if (((year % 4) == 0) && !((year % 100) == 0)){
            return true;
        } else if((year % 400) == 0){
            return true;
        }
        return false;
    }


}
