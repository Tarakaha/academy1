package homework5.task3;

public class Main {
    public static void main(String[] args) {
        Integer[][] array = {{1, 2, 3, 4}, {5, 6}, {7, 8, 9}, {10}};

        ArrayIterator<Integer> iterator = new ArrayIterator<>(array);
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(element);
        }
    }
}
