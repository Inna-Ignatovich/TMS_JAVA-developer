package GeometricalFigure;

/**
 * @author Inna Ignatovich
 * @Date 25.03.2026
 */
public class Rectangle extends Figure{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public double getWidth() { return width; }
    public double getHeight() { return height; }
}
