import Colleagues.Director;
import Colleagues.Worker;
import Colleagues.Accountant;
/**
 * @author Inna Ignatovich
 * @Date 18.03.2026
*/
public class Lesson7 {
    public static void main(String[] args) {
/*        Задача 1:
        Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
                который печатает название должности и имплементировать этот метод в созданные
        классы.
*/
        Accountant accountant = new Accountant();
        Director director = new Director();
        Worker worker = new Worker();

        accountant.printPosition();
        director.printPosition();
        worker.printPosition();
  /*
                Задача 2:
        Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
        функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
        абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
        периметра всех фигур в массиве.
*/
    }
}