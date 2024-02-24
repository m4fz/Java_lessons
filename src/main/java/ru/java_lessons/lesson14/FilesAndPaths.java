package ru.java_lessons.lesson14;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class FilesAndPaths {
    public static void main(String[] args) throws IOException {
        final String pathToDir = "E:\\test";
        final String file1 = "3.txt";
        final String file2 = "4.txt";
        final String file3 = "5.txt";
        final String folder = "folder";

        File file = new File(pathToDir);
        Path path = Path.of(pathToDir);

        boolean isDirectory = file.isDirectory();

        var owner = Files.getOwner(file.toPath());
        String ownerString = owner.getName();

        if(Objects.requireNonNull(new File(pathToDir).listFiles()).length == 0) {
            Path createdFiles1 = Files.createFile(path.resolve(file1));
            Path createdFiles2 = Files.createFile(path.resolve(file2));
            Path createdFiles3 = Files.createFile(path.resolve(file3));

            Path createdFolder = Files.createDirectory(path.resolve(folder));
        }

//        Files.move(path.resolve(file1),path.resolve(folder).resolve(file1), StandardCopyOption.REPLACE_EXISTING);

        for (int i = 0; i < 10; i++) {
            Files.writeString(path.resolve(file3), "hello\n", StandardOpenOption.APPEND);
        }

        List<String> stringList = Files.readAllLines(path.resolve(file3));

        Files.deleteIfExists(path.resolve(folder).resolve(file1));

        byte [] bytes = Files.readAllBytes(path.resolve(file3));

    }
}
