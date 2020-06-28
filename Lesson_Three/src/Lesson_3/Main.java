package Lesson_3;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] animal = {"cat", "dog", "horse", "cat", "bird", "bird", "dog", "bird", "parrot", "fish", "horse"};
        HashMap<String, Integer> fetus = new HashMap<>();
        for (String x : animal) {
            fetus.put(x, fetus.getOrDefault(x,0)+1);
        }
        System.out.println(fetus);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        PhoneBook book = new PhoneBook();
        book.addContact("Alexey", "363487");
        book.addContact("Nikita", "870977");
        book.addContact("Nikolay", "544456");
        book.addContact("Alexey", "877765");
        book.addContact("Nikolay", "877737");
        book.addContact("Alexander", "877733");

        book.findAndPrint("Alexey");
        book.findAndPrint("Alexander");
        book.findAndPrint("Nikolay");

    }
}
