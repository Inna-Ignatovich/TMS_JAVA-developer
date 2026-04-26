package Lesson14;

import java.io.*;
import java.nio.file.*;
import java.util.Arrays;
import java.util.Comparator;

public class Lesson14 {
    public static void main(String[] args) {
//    Задача 1
//    В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении. Проанализировать и записать в другой файл самое длинное слово
        String inputPath = "R&J.txt";
        String outputPath = "longestWord.txt";
        final String PATTERN = "\\P{L}+";

        try {
            // 1. Читаем весь текст из файла
            String content = Files.readString(Paths.get(inputPath));


           String longestWord = Arrays.stream(content.split(PATTERN))
                    .max(Comparator.comparingInt(String::length))
                    .orElse("");

             if (!longestWord.isEmpty()) {
                Files.writeString(Paths.get(outputPath), longestWord);
                System.out.println("Самое длинное слово : " + longestWord);
                System.out.println("Длина: " + longestWord.length());
            } else {
                System.out.println("Слова не найдены.");
            }

        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }
}