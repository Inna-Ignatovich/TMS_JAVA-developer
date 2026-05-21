package Lesson18;
import java.util.*;
import java.util.stream.Collectors;
/**
 * @author Inna Ignatovich
 * @Date 09.05.2026
 */
public class Lesson18 {
//    Задача 1:
//    Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
//    Stream'ов:
//            - Удалить дубликаты
//- Оставить только четные элементы
//- Вывести сумму оставшихся элементов в стриме
public static void main(String[] args) {
    useStreams();
}

    public static void useStreams() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,66,14,233,12,45,66,123,22,98,566,44,33));
        list.stream().
                distinct().
                filter(integer -> integer % 2 == 0).
                forEach(System.out::println);
        System.out.println(list.stream().reduce(0,Integer::sum));
        //    Задача *:
//    Создать набор данных в формате id-name, сохраненный в Map. Необходимо отобрать из
//    этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
//    Среди отобранных значений отобрать только те, которые имеют нечетное количество
//    букв в имени. После чего вернуть список List имен, записанных буквами задом наперед.
        Map<Integer,String> data = new HashMap<>();
        data.put(1, "Иван");
        data.put(2, "Петр");
        data.put(3, "Михаил");
        data.put(4, "Сергей");
        data.put(5, "Виталий");
        data.put(6, "Алексей");
        data.put(7, "Егор");
        data.put(8, "Артемий");
        data.put(9, "Андрей");
        data.put(10, "Дмитрий");
        data.put(11, "Василий");
        data.put(12, "Кирилл");
        data.put(13, "Артур");
        data.put(14, "Александр");


        Set<Integer> allowedIDs = Set.of(1, 2, 5, 8, 9, 13);

        List<String> reversedNames = data.entrySet().stream()
                .filter(entry -> allowedIDs.contains(entry.getKey()))
                .map(Map.Entry::getValue)
                .filter(name -> name.length() % 2 != 0)
                .map(name -> new StringBuilder(name).reverse().toString())
                .collect(Collectors.toList());

        System.out.println(reversedNames);

    }


}

