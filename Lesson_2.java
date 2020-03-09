package ru.geekbrains.java_2_lesson;

public class Lesson_2 {

    public static void main(String[] args) {

        /**
         * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
         *Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */
        System.out.println("\r\n1 - пример");
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = arr1[i] == 1 ? 0 : 1;
            System.out.print(arr1[i] + " ");
        }

        /**
         * Задать пустой целочисленный массив размером 8. Написать метод, который помощью цикла
         * заполнит его значениями 1 4 7 10 13 16 19 22;
         */
        System.out.println("\r\n2 - пример");
        int[] arr2 = new int[8];
        for (int i = 1, j = 1; i < arr2.length; i++) arr2[i] = j += 3;
        for (int x : arr2) System.out.print(x + " ");

        /**
         * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий
         * на вход массив и умножающий числа меньше 6 на 2;
         */
        System.out.println("\r\n3 - пример");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) arr3[i] *= 2;
            System.out.print(arr3[i] + " ");
        }

        /**
         * Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
         */
        System.out.println("\r\n4 - пример");
        int[] arr5 = {7, 5, 3, 2, 11, 4, 5, 14, 4, 8, 15, 1};
        int min = arr5[0], max = arr5[0], iMax = 0, iMin = 0;
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > max) {
                max = arr5[i];
                iMax = i;
            }
            if (arr5[i] < min) {
                min = arr5[i];
                iMin = i;
            }
            System.out.println("Максимальный элемент  в массиве под индексом " + iMax + " со значением  = " + max);
            System.out.println("Минимальный элемент  в массиве под индексом " + iMin + " со значением  = " + min);

        }

        /**
         * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое), заполнить
         * его диагональные элементы единицами, используя цикл(ы);
         */
        System.out.println("\r\n5 - пример");
        int[][] arr4 = new int[7][7];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0, j2 = arr4[i].length; j < arr4[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) arr4[i][j] = 1;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.print("\r\n");
        }

        /**Написать метод, в который передается не пустой одномерный целочисленный массив,
         * метод должен вернуть true если в массиве есть место, в котором сумма левой и правой
         * части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance
         * ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 10]) → true. Абстрактная граница показана символами ||, эти символы в массив не входят.
         */
        int[] arr6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("\r\n6 - пример, результат = " + checkBalance(arr6));

        /**Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен
         * циклически сместить все элементы массива на n позиций.
         */
        System.out.println("\r\n7 - пример +4 сдвига");
        shiftOfNumbers(arr6, 4);

        System.out.println("\r\n7 - пример -4 сдвига");
        shiftOfNumbers(arr6, -4);

    }
    private static boolean checkBalance(int[] arrParam) {
        int lSum;
        int rSum;

        for (int i = 0; i < arrParam.length + 1; i++) {

            lSum = 0;
            rSum = 0;

            for (int j = 0; j < i; j++) {
                lSum += arrParam[j];
            }

            for (int j = i; j < arrParam.length; j++) {
                rSum += arrParam[j];
            }

            if (lSum == rSum) return true;
        }
        return false;

    }
    private static void shiftOfNumbers(int[] arrParam, int n) {
        //посмотрим матрицу до сдвмга
        for (int i : arrParam) System.out.print(i + " ");
        System.out.println("\r\n");

        if (n > 0) {
            for (int x = 0; x < n; x++) {
                int buf = arrParam[arrParam.length - 1];
                if (arrParam.length - 1 >= 0) System.arraycopy(arrParam, 0, arrParam, 1, arrParam.length - 1);
                arrParam[0] = buf;
                //смотрим матрицу после каждого сдвига
                for (int i : arrParam) System.out.print(i + " ");
                System.out.println();
            }
        }
        if (n < 0) {
            for (int x = 0; x > n; x--) {
                int buf = arrParam[0];
                System.arraycopy(arrParam, 1, arrParam, 0, arrParam.length - 1);
                arrParam[arrParam.length - 1] = buf;
                //смотрим матрицу после каждого сдвига
                for (int i : arrParam) System.out.print(i + " ");
                System.out.print("\r\n");
            }
        }
    }
}
