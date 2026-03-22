import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Inna Ignatovich
 * {@code @Date} 13.03.2026
 */
public class Lesson5 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //Задача 1:
        //1.1 Создать двумерный массив, заполнить его случайными числами.
        //1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
        //1.3 Найти сумму всех получившихся элементов и вывести в консоль.

        int rows = 3;
        int cols = 4;
        int [] [] DoubleMas = new int [rows] [cols];
        for (int i = 0; i<rows; i++) {
            for (int k = 0; k<cols; k++) {
                DoubleMas [i] [k] = (int) (Math.random()*10);
            }
        }
        printMyMas(DoubleMas,"Исходный массив:");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int inputNumber = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < cols; k++) {
                DoubleMas[i][k] += inputNumber;
            }
        }
        printMyMas(DoubleMas,"Скорректированный массив:");


        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += DoubleMas[i][j];
            }
        }
        System.out.println("Сумма всех элементов массива: " + sum);


        //Задача 2:
        //Создать программу для раскраски шахматной доски с помощью цикла. Создать
        //двумерный массив String 8х8. С помощью циклов задать элементам массива значения
        //B(Black) или W(White). При выводе результат работы программы должен быть
        //следующим:
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W


        System.out.println();
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int k = 0; k < chessBoard[0].length; k++) {
                if ((i + k) % 2 == 0) chessBoard[i][k] = "W";
                else chessBoard[i][k] = "B";
            }
        }
        System.out.println("Шахматная доска:");
        for (int i = 0; i < 8; i++) {  //по строкам
            for (int j = 0; j < 8; j++) {//по столбцам
                System.out.print(" " + chessBoard[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static void printMyMas(int[][] dArray, String text) {
        System.out.println (text);
        for (int i = 0; i < dArray.length; i++) {
            System.out.println(Arrays.toString(dArray[i]));
        }
    }

}

