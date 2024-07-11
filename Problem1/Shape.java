// Shape.java
public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculatePerimeter();
    public abstract double calculateArea();

    @Override
    public String toString() {
        return String.format("Shape: %s, Perimeter: %.2f, Area: %.2f", 
            name, calculatePerimeter(), calculateArea());
    }
}