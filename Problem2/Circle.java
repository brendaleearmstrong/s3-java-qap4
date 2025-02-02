/**
 * Represents a Circle shape.
 */
public class Circle extends Shape {
    private double radius;

    /**
     * Constructor for Circle.
     * @param name The name of the circle
     * @param radius The radius of the circle
     */
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void scale(double factor) {
        this.radius *= factor;
    }
}