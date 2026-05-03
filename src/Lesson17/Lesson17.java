package Lesson17;
/*
 * @author Inna Ignatovich
 * @Date 03.05.2026
 */
import java.time.LocalDate;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class Lesson17 {
    public static void main(String[] args) {
//        Задача 1:
//        Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
//        когда пользователю исполнится 100 лет. Использовать Date/Time API.

        calculateJubilee();
        //        Задача 2:
//        Используя Predicate среди массива чисел вывести только те, которые являются
//        положительными.
        outputPoisitiveNubmers();
//        Задача 3:
//        Используя Function реализовать лямбду, которая будет принимать в себя строку в
//        формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
//        возвращать сумму, переведенную сразу в доллары.
        convertToDollarsViaFunction();
//        Задача 4:
//        Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
//        формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
//        выводить сумму, переведенную сразу в доллары.
        convertToDollarsViaConsumer();
//        Задача 5:
//        Используя Supplier написать метод, который будет возвращать введенную с консоли
//        строку задом наперед.
        convertToDollarsViaSupplier();
    }

    public static void calculateJubilee() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату своего рождения (в формате yyyy-mm-dd) ");
        LocalDate birthDate = LocalDate.parse(in.nextLine());
        System.out.println("Дата когда вам исполнится 100 лет: "+birthDate.plusYears(100));
    }

    public static void outputPoisitiveNubmers() {
        int [] numbers = new int[]{8,2,-1,-2,-4,-1,10};

        Predicate<Integer> isPositive = x -> x > 0;

        for(int number : numbers) {
            if(isPositive.test(number)) System.out.println(number);
        }
    }

    public static void convertToDollarsViaFunction() {
        Function<String, String> convert = sum ->
                Double.parseDouble(sum.split(" ")[0]) / 2.8 +" USD";
        System.out.println("500 BYN = " + convert.apply("100 BYN"));
        System.out.println("600 BYN = " + convert.apply("500 BYN"));
        System.out.println("200 BYN = " + convert.apply("400 BYN"));

        System.out.println("Введите сумму для конвертации: ");
        System.out.println(" = " + convert.apply(new Scanner(System.in).nextLine()));
    }

    public static void convertToDollarsViaConsumer() {
        Consumer<String> convert = sum ->
                System.out.println(sum + " = " + Double.parseDouble(sum.split(" ")[0]) / 2.8 +" USD");

        System.out.println("Введите сумму для конвертации: ");
        convert.accept(new Scanner(System.in).nextLine());
    }

    public static void convertToDollarsViaSupplier() {
        Supplier<String> reverseInput = () -> {
            System.out.println("Введите строку:");
            String input = new Scanner(System.in).nextLine();
            return new StringBuilder(input).reverse().toString();
        };
        System.out.println("Строка задом наперед: " + reverseInput.get());

    }
}
