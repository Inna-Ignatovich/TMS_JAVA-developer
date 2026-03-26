/**
 * @author Inna Ignatovich
 * @Date 25.03.2026
 */
import GeometricalFigure.Figure;
import GeometricalFigure.Rectangle;
import GeometricalFigure.Triangle;
import GeometricalFigure.Circle;
public class Lesson7_part2 {
    public static void main(String[] args) {
  /*
                Задача 2:
        Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
        функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
        абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
        периметра всех фигур в массиве.
*/

        Figure[] figures = {
                new Triangle(2, 7, 3),
                new Rectangle(8.2, 4),
                new Circle(3),
                new Rectangle(5, 5),
                new Circle(7.7)
        };

        double totalPerimeter = 0;

        for (int i = 0; i < figures.length; i++) {
            System.out.println("Фигура " + (i + 1) + ": ");
            figures[i].displayInfo();
            totalPerimeter += figures[i].calculatePerimeter();
        }

        System.out.printf("Периметр всех фигур: %.2f",  totalPerimeter);
    }
    }
