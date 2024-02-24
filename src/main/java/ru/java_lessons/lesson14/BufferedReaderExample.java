package ru.java_lessons.lesson14;

import java.io.*;
import java.nio.file.Path;

public class BufferedReaderExample {
    public static void main(String[] args) {
        final String pathToDir = "E:\\test";
        final String file5 = "5.txt";
        Path path = Path.of(pathToDir);

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path.resolve(file5).toString()))) {
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            System.out.println(stringBuilder);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //old way of doing the same thing

//        BufferedReader bufferedReader = null;

//        try (bufferedReader = new BufferedReader(new FileReader(path.resolve(file5).toString()))){
//            String line;
//            StringBuilder stringBuilder = new StringBuilder();
//            while((line = bufferedReader.readLine()) != null){
//                stringBuilder.append(line).append("\n");
//            }
//            System.out.println(stringBuilder);
//        } catch (IOException ex){
//            System.out.println(ex.getMessage());
//        } finally {
//            try {
//              bufferedReader.close();
//       } catch(IOException e) {
//        System.out.println(e.getMessage());
//    }
    }
}

