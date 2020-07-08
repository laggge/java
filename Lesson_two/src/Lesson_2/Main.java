package Lesson_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int row;
        int column;
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите значения для двумерного массива. Размер (4х4). Строка и колонка: ");
        row = sc.nextInt();
        column = sc.nextInt();

        String[][] newArray = new String[row][column];
        try {
            createArr(newArray, sc, row, column);
            System.out.println("Сумма " + +calcArr(newArray, row, column));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    private static void createArr(String[][] array, Scanner sc, int row, int column) {
        if (row != 4 || column != 4) throw new MyArraySizeException(row, column);
        System.out.println("Создание массива ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Строка " + i + " колонка " + j);
                array[i][j] = sc.next();
            }
        }
        printArr(array);
        calcArr(array, row, column);
    }

    private static int calcArr(String[][] array, int row, int column) {
        int sum = 0;
        int[][] arrayInt = new int[row][column];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    arrayInt[i][j] = Integer.parseInt(array[i][j]);
                    sum += arrayInt[i][j];
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        printArrInt(arrayInt);
        return sum;
    }

    private static void printArr(String[][] array) {
        for (String[] strings : array) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }

    private static void printArrInt(int[][] array) {
        System.out.println("Этот массив Int ");
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
    }
}
