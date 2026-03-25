package GeometricalFigure;

/**
 * @author Inna Ignatovich
 * @Date 25.03.2026
 */
public class Triangle extends Figure{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        //полупериметр :
        double semiperimeter = calculatePerimeter() / 2;
        //квадратный корень :
        return Math.sqrt(semiperimeter *
                (semiperimeter - sideA) *
                (semiperimeter - sideB) *
                (semiperimeter - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    public double getSideA() { return sideA; }
    public double getSideB() { return sideB; }
    public double getSideC() { return sideC; }
}
