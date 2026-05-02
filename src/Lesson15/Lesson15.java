package Lesson15;
import java.util.*;

/**
 * @author Inna Ignatovich
 * @Date 01.05.2026
 */
public class Lesson15 {
   public static void main(String[] args) {

//    Задача 1:
//    Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
//            4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
//    При решении использовать коллекции.
       deleteDuplicatesViaCollection();


//    Задача 2:
//    Создать класс, который будет хранить в себе коллекцию с названиями животных.
//    Реализовать методы удаления и добавления животных по следующим правилам:
//    добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
//    объекта этого класса в main методе другого класса.
       manageAnimalsCollection();
//    Задача 3:
//    Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
//    оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
//    Написать метод, который удаляет студентов со средним баллом <3. Если средний
//    балл>=3, студент переводится на следующий курс. Дополнительно написать метод
//    printStudents(List<Student> students, int course), который получает список студентов и
//    номер курса. А также печатает на консоль имена тех студентов из списка, которые
//    обучаются на данном курсе.
       manageStudents();

   }
    public static void deleteDuplicatesViaCollection() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа через запятую:");
        String input = scanner.nextLine();

        String[] parts = input.split("\\s*,\\s*");

        Set<String> uniqueElements = new LinkedHashSet<>(Arrays.asList(parts));

        String result = String.join(", ", uniqueElements);

        System.out.println("Результат без повторов:");
        System.out.println(result);

    }
    public static void manageAnimalsCollection() {

        AnimalsCollection animals = new AnimalsCollection();

        animals.addAnimal("Bear");
        animals.addAnimal("Fox");
        animals.addAnimal("Monkey");
        animals.addAnimal("Rabbit");

        animals.animalsQueue.forEach(System.out::println);
        animals.removeAninal();
        System.out.println();
        animals.animalsQueue.forEach(System.out::println);
    }
    public static void manageStudents() {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Ivan", "450532", 2, new double[]{5, 4, 3, 3, 4}));
        students.add(new Student("Maria", "450533", 1, new double[]{5, 2, 5, 3, 5}));
        students.add(new Student("Alex", "450534", 3, new double[]{4, 4, 1, 4, 3}));
        students.add(new Student("Anna", "450535", 2, new double[]{3, 4, 2, 3, 2}));
        students.add(new Student("Dmitry", "450536", 4, new double[]{5, 5, 4, 5, 5}));
        students.add(new Student("Elena", "450537", 1, new double[]{4, 3, 4, 4, 3}));
        students.add(new Student("Sergey", "450538", 3, new double[]{1, 1, 5, 2, 5}));
        students.add(new Student("Olga", "450539", 2, new double[]{3, 3, 3, 4, 3}));
        students.add(new Student("Pavel", "450540", 4, new double[]{4, 1, 1, 4, 4}));
        students.add(new Student("Natalia", "450541", 1, new double[]{5, 1, 1, 1, 4}));


        StudentManager manager = new StudentManager(students);
        manager.printStudents();
        manager.filterStudents();
        System.out.println("--".repeat(50));
        manager.printStudents();

        manager.printStudentsByCourse(2);
    }
    }

