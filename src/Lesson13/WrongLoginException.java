package Lesson13;

/**
 * @author Inna Ignatovich
 * @Date 20.04.2026
 */
public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super();
    }
    public WrongLoginException(String message) {
        super(message);
    }
}
