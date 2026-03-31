package Clinic;

/**
 * @author Inna Ignatovich
 * @Date 31.03.2026
 */
public class Stomatologist extends Doctor {
    @Override
    public void treat() {
        System.out.println("Лечение у стоматолога");
    }

    @Override
    public String toString() {
        return "Стоматолог";
    }
}
