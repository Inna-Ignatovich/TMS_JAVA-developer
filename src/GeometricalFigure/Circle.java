package GeometricalFigure;

/**
 * @author Inna Ignatovich
 * @Date 25.03.2026
 */
public class Circle extends Figure {
    private double radius;
    private static final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }

    public double getRadius() { return radius; }
}
