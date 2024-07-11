// Demo.java
public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
            new Circle("Circle", 5),
            new Ellipse("Ellipse", 4, 3),
            new Triangle("Triangle", 3, 4, 5),
            new EquilateralTriangle("Equilateral Triangle", 5)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}