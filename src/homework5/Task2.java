package homework5;

import java.util.*;

/**
 * Можно писать все в main. Не нужно создавать новых классов.
 * Напишите метод, который добавляет 1_000_000 элементов в ArrayList и LinkedList.
 * Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100_000 раз.
 * Замерьте время, которое потрачено на это.
 * Сравните результаты и предположите, почему они именно такие.
 */
public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Работа с ArrayList");
        System.out.println("Засекаем время...");
        long arrayStartTime = System.currentTimeMillis();

        System.out.println("Добавляем элементы...");
        addElements(arrayList);

        System.out.println("Выбираем элементы...");
        takeElements(arrayList);

        long arrayEndTime = System.currentTimeMillis();
        long arrayListTime = arrayEndTime - arrayStartTime;
        System.out.println("Затрачено времени на ArrayList: " + arrayListTime + " ms");

        System.out.println("****************************");

        System.out.println("Работа с LinkedList");
        System.out.println("Засекаем время...");
        long linkedStartTime = System.currentTimeMillis();

        System.out.println("Добавляем элементы...");
        addElements(linkedList);

        System.out.println("Выбираем элементы...");
        takeElements(linkedList);

        long linkedEndTime = System.currentTimeMillis();
        long linkedListTime = linkedEndTime - linkedStartTime;
        System.out.println("Затрачено времени на LinkedList: " + linkedListTime + " ms");
    }
    /* Из работы приложения можно сделать следующий вывод. Для быстрой работы с необходимыми данными на добавление и
     поиск лучше использовать ArrayList,
     т.к. LinkedList является связанным списком и не имеет прямой доступ к элементам по индексу
     и ему приходится всегда пробегаться к необходимому элементу начиная от первого.*/

    public static void addElements(List<Integer> list) {
        for (int i = 0; i < 1_000_000; i++) {
            list.add(i);
        }
    }

    public static void takeElements(List<Integer> list) {

        Random random = new Random();
        for (int i = 0; i < 100_000; i++) {
            int randomValue = random.nextInt(list.size());
            list.get(randomValue);
        }
        System.out.println("Процесс завершён.");
    }
}

