package ru.java_lessons.lesson14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class BufferedWriterExample {
    public static void main(String[] args) {
        final String pathToDir = "E:\\test";
        final String file4 = "4.txt";
        Path path = Path.of(pathToDir);

        String content = "Hello Java";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path.resolve(file4).toString(), true))) {
            bufferedWriter.write(content);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
