/**
 * @author Inna Ignatovich
 * @Date 24.03.2026
 */
import CreditCard.CreditCard;
public class Lesson6 {
    public static void main(String[] args) {

/*
    Задача 1:
    Создать класс CreditCard c полями номер счета, текущая сумма на счету.
    Добавьте метод, который позволяет начислять сумму на кредитную карточку.
    Добавьте метод, который позволяет снимать с карточки некоторую сумму.
    Добавьте метод, который выводит текущую информацию о карточке.
    Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
    Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с третьей.
    Выведите на экран текущее состояние всех трех карточек.
     */
        CreditCard card1 = new CreditCard("1111 2211 3311 4411", 1000);
        CreditCard card2 = new CreditCard("1122 2222 3322 4422", 2000);
        CreditCard card3 = new CreditCard("1133 2233 3333 4433", 3000);
        card1.putMoney(10);
        card2.putMoney(20);
        card3.drawMoney(30);
//        System.out.println(card1);
//        System.out.println(card2);
//        System.out.println(card3);
//        System.out.println();
        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();
    }
}
