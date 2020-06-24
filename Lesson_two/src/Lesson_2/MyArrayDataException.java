package Lesson_2;

public class MyArrayDataException extends RuntimeException{
    int i, j;

    public MyArrayDataException(int i, int j) {
        super("Неверные данные. Имеется: строка " + i + ", колонка " + j);
        this.i = i;
        this.j = j;
    }
}
