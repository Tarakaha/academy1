package homework6.task3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Создайте класс User с полями Имя, Фамилия, Возраст и конструктором(Имя, Фамилия, Возраст).
 * В классе Main создайте ArrayList<User>, добавьте 10 пользователей в коллекцию.
 * Создайте каталог(папку) users и для каждого пользователя создайте файл в этом каталоге.
 * Назовите файл Имя_Фамилия.txt. Сериализуйте информацию о пользователе и положите в файл пользователя.
 * Не забываем закрывать потоки. В блоке catch выводим сообщение ошибки на экран (System.err.println(e.getMessage());)
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Иван", "Иванов", 20));
        users.add(new User("Петр", "Петров", 25));
        users.add(new User("Алексей", "Сидоров", 30));
        users.add(new User("Екатерина", "Смирнова", 35));
        users.add(new User("Мария", "Кузнецова", 40));
        users.add(new User("Андрей", "Васильев", 45));
        users.add(new User("Ольга", "Петрова", 50));
        users.add(new User("Александр", "Соловьев", 55));
        users.add(new User("Наталья", "Иванова", 60));
        users.add(new User("Дмитрий", "Петров", 65));

        File directory = new File("Users");
        if (!directory.exists()) {
            boolean dirCreated = directory.mkdir();
            System.out.println("result of creating directory '" + directory.getName() + "' is " + dirCreated);
        }

        for (User user : users) {
            String fileName = "Users/" + user.getFirstName() + "_" + user.getLastName() + ".txt";
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
                out.writeObject(user);
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
            System.out.println(user.getFirstName() + " " + user.getLastName() + " - serialized");
        }
    }
}