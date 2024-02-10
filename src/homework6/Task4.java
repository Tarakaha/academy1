package homework6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * Создайте каталог(папку). Создайте в папке 100 txt файлов (Например, 1.txt, 2.txt ... 100.txt).
 * Считываем текст из 2-ого задания, получаем его длинну (576 символов).
 * Для каждого файла генерируем рандомное число от 0 до 576, достаем из текста (из 2 задания)
 * такое-же количество символов (string.substring()) и сохраняем в наш файл.
 * Создайте файл result.txt и запишите туда список всех файлов и их размеры.
 */

public class Task4 {
    public static void main(String[] args) {
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
                + "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown "
                + "printer took a galley of type and scrambled it to make a type specimen book. It has survived not "
                + "only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."
                + "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,"
                + " and more recently with desktop publishing software like Aldus PageMaker including versions of "
                + "Lorem Ipsum.";

        File directory = new File("src/homework6/task4");
        directory.mkdir();

        for (int i = 1; i <= 100; i++) {
            String fileName = i + ".txt";
            File file = new File(directory, fileName);

            try {
                FileWriter writer = new FileWriter(file);

                int randomLength = new Random().nextInt(text.length() + 1);
                String substring = text.substring(0, randomLength);

                writer.write(substring);
                writer.close();

                System.out.println("Файл " + fileName + " успешно создан.");
            } catch (IOException e) {
                System.out.println("Ошибка при создании файла " + fileName + ": " + e.getMessage());
            }
        }

        File resultFile = new File(directory, "result.txt");

        try {
            FileWriter resultWriter = new FileWriter(resultFile);

            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    long fileSize = file.length();
                    resultWriter.write(file.getName() + " - " + fileSize + " байт\n");
                }
            }

            resultWriter.close();
            System.out.println("Файл result.txt успешно создан.");
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла result.txt: " + e.getMessage());
        }
    }
}
