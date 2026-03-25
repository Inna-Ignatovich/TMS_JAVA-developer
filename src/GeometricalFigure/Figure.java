package GeometricalFigure;

/**
 * @author Inna Ignatovich
 * @Date 25.03.2026
 */
public abstract class Figure {

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void displayInfo() {
        System.out.println(getClass().getSimpleName() +
                ": Площадь = " + String.format("%.2f", calculateArea()) +
                ", периметр = " + String.format("%.2f", calculatePerimeter()));
    }
}
