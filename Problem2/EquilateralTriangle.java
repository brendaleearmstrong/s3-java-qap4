// EquilateralTriangle.java
public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);
    }

    @Override
    public double calculateArea() {
        return (Math.sqrt(3) / 4) * side1 * side1;
    }

    // scale method is inherited from Triangle
}