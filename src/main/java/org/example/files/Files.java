package org.example.files;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Random;
import java.util.stream.Collectors;

public class Files {

    public static void main(String[] args) {
        Path path = Path.of("/Users/damianfiginski/IdeaProjects/GenericTypes/src/main/resources/data");
        Path path2 = Path.of("/Users/damianfiginski/IdeaProjects/GenericTypes/src/main/resources/secondData");
        createFirstFile(path);
        createSecondFile(path, path2);
    }

    private static void createSecondFile(Path path, Path path2) {
        try {
            java.nio.file.Files.createFile(path2);

            String result = java.nio.file.Files.lines(path)
                    .map(Integer::parseInt)
                    .filter(number -> number % 2 == 0)
                    .map(Object::toString)
                    .collect(Collectors.joining(System.lineSeparator()));

            java.nio.file.Files.write(path2, result.getBytes());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static void createFirstFile(Path path) {
        try {
            java.nio.file.Files.createFile(path);
            Random random = new Random();
            for (int i = 0; i < 500; i++) {
                Integer randomNumber = random.nextInt(1000000) + 999;
                java.nio.file.Files.write(path, String.valueOf(randomNumber).getBytes(), StandardOpenOption.APPEND);
                java.nio.file.Files.write(path, System.lineSeparator().getBytes(), StandardOpenOption.APPEND);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
