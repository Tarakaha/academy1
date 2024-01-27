package homework5;

import java.util.HashMap;
import java.util.Map;

/**
 * Можно писать все в main. Не нужно создавать новых классов.
 * Имеется текст. Следует составить для него частотный словарь:
 * Создать Map<Character, Integer> для символов, в который мы заносим символ и его количество.
 */
public class Task5 {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor";
        Map<Character, Integer> dictionary = new HashMap<>();

        for (char c : text.toCharArray()) {
            dictionary.put(c, dictionary.getOrDefault(c, 0) + 1);
        }

        System.out.println("Частотный словарь по тексту:");
        for (Map.Entry<Character, Integer> entry : dictionary.entrySet()) {
            System.out.println("Символ: \"" + entry.getKey() + "\", Количество: " + entry.getValue());
        }
    }
}
