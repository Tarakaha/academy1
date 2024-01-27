package homework5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными
 * оценками. Найти самую высокую оценку с использованием итератора.
 */
public class Task4 {
    public static void main(String[] args) {

        ArrayList<Integer> grades = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int grade = (int) (Math.random() * 10 + 1);
            grades.add(grade);
        }

        Iterator<Integer> iterator = grades.iterator();
        int maxGrade = 0;
        while (iterator.hasNext()) {
            int grade = iterator.next();
            if (grade > maxGrade) {
                maxGrade = grade;
            }
        }

        System.out.println("Журнал оценок: " + grades);
        System.out.println("Самая высокая оценка: " + maxGrade);
    }
}
