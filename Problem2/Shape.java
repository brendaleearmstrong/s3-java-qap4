/**
 * Abstract class representing a geometric shape.
 * Implements Scalable interface but doesn't provide implementation for scale method.
 */
public abstract class Shape implements Scalable {
    protected String name;

    /**
     * Constructor for Shape.
     * @param name The name of the shape
     */
    public Shape(String name) {
        this.name = name;
    }

    /**
     * Calculates the perimeter of the shape.
     * @return The perimeter of the shape
     */
    public abstract double calculatePerimeter();

    /**
     * Calculates the area of the shape.
     * @return The area of the shape
     */
    public abstract double calculateArea();

    @Override
    public String toString() {
        return String.format("Shape: %s, Perimeter: %.2f, Area: %.2f", 
            name, calculatePerimeter(), calculateArea());
    }

    // The scale method will be implemented by subclasses
}