package Lesson15;
import java.util.ArrayDeque;
/**
 * @author Inna Ignatovich
 * @Date 02.05.2026
 */
public class AnimalsCollection {
    ArrayDeque<String> animalsQueue = new ArrayDeque<>();

    public void addAnimal(String name) {
        animalsQueue.addFirst(name);
    }
    public void removeAninal() {
        animalsQueue.removeLast();
    }
}
