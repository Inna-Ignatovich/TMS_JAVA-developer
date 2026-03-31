package Clinic;

/**
 * @author Inna Ignatovich
 * @Date 31.03.2026
 */
public class Surgeon extends Doctor{
    @Override
    public void treat() {
        System.out.println("Хирург проводит операцию");
    }

    @Override
    public String toString() {
        return "Хирург";
    }
}
