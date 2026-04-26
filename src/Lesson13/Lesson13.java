package Lesson13;
import java.util.Scanner;

/**
 * @author Inna Ignatovich
 * @Date 20.04.2026
 */
public class Lesson13 {
//    Задача 1:
//    Создать класс, в котором будет статический метод. Этот метод принимает на вход три
//    параметра: login, password, confirmPassword. Все поля имеют тип данных String. Длина
//    login должна быть меньше 20 символов и не должен содержать пробелы. Если login не
//    соответствует этим требованиям, необходимо выбросить WrongLoginException. Длина
//    password должна быть меньше 20 символов, не должен содержать пробелом и должен
//    teachmeskills.by
//    содержать хотя бы одну цифру. Также password и confirmPassword должны быть равны.
//    Если password не соответствует этим требованиям, необходимо выбросить
//    WrongPasswordException. WrongPasswordException и WrongLoginException -
//    пользовательские классы исключения с двумя конструкторами – один по умолчанию,
//    второй принимает сообщение исключения и передает его в конструктор класса Exception.
//    Метод возвращает true, если значения верны, false в противном случае.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = input.nextLine();
        System.out.println("Введите пароль: ");
        String password = input.nextLine();
        System.out.println("Подтвердите пароль: ");
        String confirmPassword = input.nextLine();
        try {
            System.out.println(UserValidator.validate(login,password, confirmPassword));
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
