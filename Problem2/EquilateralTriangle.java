/**
 * Represents an Equilateral Triangle shape.
 */
public class EquilateralTriangle extends Triangle {
    /**
     * Constructor for EquilateralTriangle.
     * @param name The name of the equilateral triangle
     * @param side Length of a side
     */
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);
    }

    @Override
    public double calculateArea() {
        return (Math.sqrt(3) / 4) * side1 * side1;
    }

    // scale method is inherited from Triangle
}