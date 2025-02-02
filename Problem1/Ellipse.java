// Ellipse.java
public class Ellipse extends Shape {
    private final double a; // major axis
    private final double b; // minor axis

    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        this.a = Math.max(axis1, axis2);
        this.b = Math.min(axis1, axis2);
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * Math.sqrt(2 * (a*a + b*b) - Math.pow(a-b, 2) / 2);
    }

    @Override
    public double calculateArea() {
        return Math.PI * a * b;
    }
}