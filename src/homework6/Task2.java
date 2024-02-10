package homework6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Создать руками текстовый файл, закинуть следующий текст:
 * "Lorem Ipsum is simply dummy text of the printing and typesetting industry.
 * Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took
 * a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,
 * but also the leap into electronic typesetting, remaining essentially unchanged.
 * It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,
 * and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
 * Создать новый файл result.txt. Программно считать файл с текстом, удалить все пробелы и записать полученный текст в result.txt.
 */

public class Task2 {
    public static void main(String[] args) {
        // Создание текстового файла и запись в него
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
                + "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown "
                + "printer took a galley of type and scrambled it to make a type specimen book. It has survived not "
                + "only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."
                + "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,"
                + " and more recently with desktop publishing software like Aldus PageMaker including versions of "
                + "Lorem Ipsum.";

        try (PrintWriter writer = new PrintWriter("text.txt")) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
             PrintWriter writer = new PrintWriter("result.txt")) {
            String line = reader.readLine();
            while (line != null) {
                String noSpacesLine = line.replaceAll("\\s+", ""); // Удаление пробелов
                writer.write(noSpacesLine);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
