package User;
import java.util.Scanner;
/**
 * @author Inna Ignatovich
 * @Date 05.04.2026
 */
public class Lesson10 {
    private static Object Бубликовa;

    //    Задача 1:
//    Создать класс для описания пользователя системы. Переопределить в классе методы
//    toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
//    значением полей и сравнить с помощью метода equals.
public static void main(String[] args) {
    User Бубликовa = new User(123, "Бубликовa А.В.");
    User Сидоров = new User(123, "Сидоров А.О.");
    User Сидоровa = new User(123, "Бубликовa А.В.");

    System.out.println("Сидоров это Бубликовa? " + Сидоров.equals(Бубликовa));
    System.out.println("Результат сравнения хеш-кодов: " + (Сидоров.hashCode() == Бубликовa.hashCode()));

    System.out.println("Сидоровa бывшая Бубликовa? " + Сидоровa.equals(Бубликовa));
    System.out.println("Результат сравнения хеш-кодов: " + (Сидоровa.hashCode() == Бубликовa.hashCode()));
}
}
