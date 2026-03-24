import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Inna Ignatovich
 * {@code @Date} 13.03.2026
 */
public class Lesson4 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Введите размер массива (любое целое положительное число): ");

        if (sc.hasNextInt()) {
            int resultNum = 0;
            int inputNum = sc.nextInt();
            if (inputNum < 0) {
                System.out.println("Введите число больше 0!");
                sc.next();
            }

            System.out.println("Задан массив размерностью:" + inputNum);
            int arrayS[] = new int[inputNum];

            for (int i = 0; i < inputNum; i++) {
                //наибольшее целое, не превышающее arrayS[i] возвращаю:
                arrayS[i] = (int) (Math.floor(Math.random() * 100 / 10));
            }

            System.out.println("# Задача 4.1. Ввод элементов массива, используя функцию Math.random() ");
            System.out.println("Вывод элементов массива в прямом порядке:");
            System.out.println(Arrays.toString(arrayS));
            System.out.println("Вывод элементов массива в обратном порядке:");

            //   Arrays.sort(arrayS, Collections.reverseOrder());

            for (int i = arrayS.length - 1; i >= 0; i--) {
                if (i == arrayS.length - 1) {
                    System.out.print("[");
                }
                System.out.print(arrayS[i]);
                if (i > 0) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println(" ");
            System.out.println("# Задача 4.2. Найти минимальный-максимальный элементы ");

            int minElement = arrayS[0];
            int minElementInd = 0;
            int maxElement = arrayS[0];
            int maxElementInd = 0;
            int zeroTotal = 0;
            for (int i = 1; i < arrayS.length; i++) {
                if (minElement > arrayS[i]) {
                    minElement = arrayS[i];
                    minElementInd = i;
                }
                if (maxElement < arrayS[i]) {
                    maxElement = arrayS[i];
                    maxElementInd = i;
                }
                if (arrayS[i] == 0) {
                    zeroTotal ++;
                }

            }
            System.out.print("Минимальный элемент: " + minElement + ".");
            System.out.print(" Максимальный элемент: " + maxElement + ".");
            System.out.println(" ");
//            System.out.println("# Задача 4.2_2. минимальный-максимальный элементы через сортировку ");
//            Arrays.sort(arrayS);
//            System.out.print("Минимальный элемент: " + arrayS[0] + ".");
//            System.out.print(" Максимальный элемент: " + arrayS[arrayS.length - 1] + ".");
//            System.out.println(" ");
            System.out.println("# Задача 4.3. Найти индексы минимального и максимального элементов ");
            System.out.print("Индекс минимального элемента: " + minElementInd + ".");
            System.out.print("Индекс максимального элемент: " + maxElementInd + ".");
            System.out.println(" ");
            System.out.println("# Задача 4.4. Найти и вывести количество нулевых элементов. Если нулевых элементов нет" +
                    " - вывести\n" +
                    "сообщение, что их нет. ");
            if (zeroTotal == 0) {
                System.out.println("Нет нулевых элементов!");
            } else {
                System.out.println("Количество нулевых элементов: "+zeroTotal);
            }
            System.out.println("# Задача 4.5. Пройти по массиву и поменять местами элементы ");
            for (int i = arrayS.length - 1; i >= 0; i--) {
                System.out.print(arrayS[i]);
                if (i > 0) {
                    System.out.print(", ");
                }
            }
            System.out.println(" ");
            System.out.println("# Задача 4.6. Проверить, является ли массив возрастающей последовательностью  ");
            boolean masIncr = true;
            for (int i = 0; i < inputNum; i++) {
                if (arrayS[i] >= arrayS[i + 1]) {
                    masIncr = false;
                    break;
                }
            }
            if (masIncr) {
                System.out.println("Массив - возрастающая последовательность.");
            } else {
                System.out.println("Массив - не возрастающая последовательность. ");
            }
            return;
        } else {
            System.out.println("Не числовой тип данных!");
            sc.next();
        }
    }

}
