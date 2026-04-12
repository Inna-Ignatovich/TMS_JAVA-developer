import java.util.Scanner;

/**
 * @author Inna Ignatovich
 * @Date 12.04.2026
 */
public class Lesson11 {

    public static void main(String[]args) {
//        1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
//        найденные строки и их длину.
//        2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
//        значений их длины.
//        3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
//        средней, а также их длину.
//        4. Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
//        Если таких слов несколько, найти первое из них.
//        5. Вывести на консоль новую строку, которой задублирована каждая буква из
//        начальной строки. Например, "Hello" -> "HHeelllloo".


        String[] strings = new String[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 строки:");
        for (int i = 0; i < 3; i++) {
            strings[i] = scanner.nextLine();
        }
        String shortestString = strings[0];
        String longestString  = strings[0];

        for (int i = 1; i < 3; i++) {
            if (strings[i].length() < shortestString.length()) shortestString = strings[i];
            if (strings[i].length() > longestString.length()) longestString = strings[i];
        }

        System.out.printf("Самая короткая: %s (длина: %d)\n", shortestString, shortestString.length());
        System.out.printf("Самая длинная: %s (длина: %d)\n", longestString, longestString.length());
        String middleString = (!strings[0].equals(shortestString)) && (!strings[0].equals(longestString)) ? strings[0] :
                (!strings[1].equals(shortestString)) && (!strings[1].equals(longestString)) ? strings[1] :
                        strings[2];

        System.out.printf("Строки в порядке возрастания длины:\n%s\n%s\n%s\n", shortestString, middleString, longestString);

        double averageLength = 0;
        for (String s : strings) {
            averageLength += s.length();
        }
        averageLength /= strings.length;
        System.out.println("Длина массива: " + strings.length);
        System.out.println("Средняя длина: " + averageLength + ". Строки меньше средней:");
        for (String s : strings) {
            if (s.length() < averageLength) {
                System.out.println("   " + s + " (длина: " + s.length() + ")");
            }
        }


        String foundWord = null;
        for (String string : strings) {
            if (foundWord != null) {
                break;
            }
            // в строке признаком разделения слов считаю пробел
            String[] words = string.split("\\s+");
            for (String word : words) {
                if (foundWord != null) {
                    break;
                }
                char[] chars = word.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (word.indexOf(chars[i], i + 1) != -1) {
                    break;
                }
                if (i == chars.length - 1) {
                    foundWord = word;
                    break;
                }
                if (foundWord != null) {
                    break;
                }
            }

        }
        }

        if (foundWord != null) {
            System.out.println("Первое слово с уникальными символами: " + foundWord);
        } else {
            System.out.println("Нет слова из уникальных символов.");
        }

            StringBuilder doubled = new StringBuilder();
            for (char ch : strings[0].toCharArray()) {
                doubled.append(ch).append(ch);
            }
            System.out.println(" Задвоение первой строки:  " + doubled.toString());

    }
}
