package ru.java_lessons.lesson14;

import lombok.SneakyThrows;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {
        final String pathToDir = "E:\\test";
        final String file2 = "2.txt";
        Path path = Path.of(pathToDir);

        File file= new File(pathToDir);
        File[] files = file.listFiles();

        Optional<Path> file2Path = Optional.empty();
        if (!Files.exists(path.resolve(file2))) {
            file2Path = Optional.of(Files.createFile(path.resolve(file2)));
        }
        file2Path.ifPresent(value -> System.out.println("File " + value.getFileName() + " created"));
    }
}
