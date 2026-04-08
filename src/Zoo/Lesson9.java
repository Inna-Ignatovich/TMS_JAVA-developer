package Zoo;

import java.util.Scanner;

/**
 * @author Inna Ignatovich
 * @Date 31.03.2026
 */
public class Lesson9 {public static void main(String[] args) {

    /*
   Задача 1:
    Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
            Переопределить методы voice(), eat(String food) чтобы они выводили верную
    информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
            Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
    туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
    или другую строку то он будет недоволен.
*/

    Scanner input = new Scanner(System.in);
    System.out.println("Меню на сегодня:");
    String[] menu = {"Meat", "Grass", "Anything"};
    for (int i = 0; i < 3; i++) {
        System.out.println(menu[i]);
    }
    Animal[] animals = {new Dog(), new Rabbit(), new Tiger()};
    String[] foods = new String[animals.length];
    for (int i = 0; i < foods.length; i++) {
        System.out.println("Введите еду для " + animals[i].getName());
        foods[i] = input.nextLine();
    }
    for (int i = 0; i < animals.length; i++) {
        animals[i].eat(foods[i]);
    }
    for (Animal animal : animals) {
        animal.voice();
    }
}
}