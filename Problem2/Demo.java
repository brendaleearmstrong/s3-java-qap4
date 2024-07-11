// Demo.java
public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
            new Circle("Circle", 5),
            new Ellipse("Ellipse", 4, 3),
            new Triangle("Triangle", 3, 4, 5),
            new EquilateralTriangle("Equilateral Triangle", 5)
        };

        System.out.println("Original shapes:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        System.out.println("\nScaling shapes by factor of 2:");
        scaleShapes(shapes, 2);

        System.out.println("\nScaled shapes:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void scaleShapes(Scalable[] scalables, double factor) {
        for (Scalable scalable : scalables) {
            scalable.scale(factor);
        }
    }
}