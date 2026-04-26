package Lesson13;

/**
 * @author Inna Ignatovich
 * @Date 20.04.2026
 */
public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super();
    }
    public WrongPasswordException(String message) {
        super(message);
    }
}
