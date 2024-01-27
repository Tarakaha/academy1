package homework5;

import java.lang.reflect.Array;

/**
 * Попробовать добавить в массив int на 8 элементов 10 чисел.
 * Обернуть в try/catch, словить ArrayIndexOutOfBoundsException и вывести на экран сообщение:
 * "Array is to small, expand the array".
 */
public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[8];
        try {
            for (int i = 0; i < 10; i++) {
                array[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array is to small, expand the array!");
        }
    }
}
