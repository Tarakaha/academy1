package homework6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/** Задание 1.
 Прочесть информацию введеную из клавиатури и записать в созданный вами txt файл,
 если введена "stop" строка тогда закончить запись в файл.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriter writer = null;

        try {
            writer = new FileWriter("output.txt", true);

            while (true) {
                String input = scanner.nextLine();

                if (input.equals("stop")) {
                    break;
                }

                writer.write(input);
                writer.write(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Ошибка при закрытии файла: " + e.getMessage());
                }
            }
        }

        System.out.println("Данные записаны в файл успешно.");
    }
}
