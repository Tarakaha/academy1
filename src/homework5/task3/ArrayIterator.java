package homework5.task3;

import java.util.Iterator;

/** Написать итератор по двумерному массиву. (Отдельный класс. Наследуемся от Iterator<T>)
    Протестировать в main.
 */
public class ArrayIterator<T> implements Iterator<T> {

    private final T[][] array;
    private int row;
    private int col;

    public ArrayIterator(T[][] array) {
        this.array = array;
        this.row = 0;
        this.col = 0;
    }

    @Override
    public boolean hasNext() {
        return row < array.length && col < array[row].length;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            System.out.println("Что-то пошло не так. Элемент не найден!");
            System.exit(0);
        }

        T element = array[row][col];
        col++;
        if (col >= array[row].length) {
            row++;
            col = 0;
        }
        return element;
    }
}

