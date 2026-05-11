package Lesson16;
import java.util.*;
/**
 * @author Inna Ignatovich
 * @Date 02.05.2026
 */
public class Lesson16 {
//    Задача 1:
//    На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
//    строка является ключом, и ее значение равно true, если эта строка встречается в массиве
//    2 или более раз.

//    Задача 2:
//    На вход поступает массив непустых строк, создайте и верните Map<String,
//    String> следующим образом: для каждой строки добавьте ее первый символ в
//    качестве ключа с последним символом в качестве значения.
public static void main(String[] args) {
    System.out.println(markduplicates(new String[]{"c", "c", "c", "c"}));
    System.out.println(firstAndLastChar(new String[]{"code","bug"}));

}

    public static Map<String, Boolean> markduplicates(String[] strings) {
        HashMap<String, Boolean> stringBooleanHashMap = new HashMap<>();
        ArrayDeque<String> stringArrayDeque = new ArrayDeque<>(Arrays.asList(strings));
        String temp;
        while(!stringArrayDeque.isEmpty()) {
            temp = stringArrayDeque.pop();
            if(stringArrayDeque.contains(temp)) {
                while(stringArrayDeque.contains(temp)) { stringArrayDeque.remove(temp); }
                stringBooleanHashMap.put(temp, true);
                continue;
            }
            stringBooleanHashMap.put(temp,false);
        }
        return stringBooleanHashMap;
    }

    public static Map<String, String> firstAndLastChar(String[] strings) {
        HashMap<String, String> stringMap = new HashMap<>();
        for(String s : strings) {
            stringMap.put(String.valueOf(s.toCharArray()[0]), String.valueOf(s.toCharArray()[s.length()-1]));
        }
        return stringMap;
    }
}
