package Lesson_2;

public class MyArraySizeException extends RuntimeException {
    int row, column;

    public MyArraySizeException(int row, int column) {
        super("Неверные данные, строк и колонок может быть только 4. Имеется: строка " + row + ", колонка " + column);
        this.row = row;
        this.column = column;
    }
}
