package homework5;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Можно писать все в main. Не нужно создавать новых классов.
 * Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
 */

public class Task1 {
    public static void main(String[] args) {
        Collection<String> strings = new ArrayList<>() {{
            add(" Привет");
            add("Как дела?");
            add(" Привет");
            add("Как погода?");
            add("Как дела?");
            add("азаза");
        }};
        Collection<String> newStrings = removeDuplicates(strings);
        System.out.println(newStrings);
    }

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}
