/**
 * Demo class to test the Shape hierarchy and Scalable interface.
 */
public class Demo {
    public static void main(String[] args) {
        Scalable[] shapes = new Scalable[] {
            new Circle("Circle", 5),
            new Ellipse("Ellipse", 4, 3),
            new Triangle("Triangle", 3, 4, 5),
            new EquilateralTriangle("Equilateral Triangle", 5)
        };

        System.out.println("Original shapes:");
        printShapes(shapes);

        System.out.println("\nScaling shapes by factor of 2:");
        scaleShapes(shapes, Scalable.DEFAULT_SCALE_FACTOR);

        System.out.println("\nScaled shapes:");
        printShapes(shapes);
    }

    /**
     * Scales an array of Scalable objects.
     * @param scalables Array of Scalable objects
     * @param factor Scaling factor
     */
    public static void scaleShapes(Scalable[] scalables, double factor) {
        for (Scalable scalable : scalables) {
            scalable.scale(factor);
        }
    }

    /**
     * Prints details of an array of Shape objects.
     * @param shapes Array of Shape objects
     */
    public static void printShapes(Scalable[] shapes) {
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }
    }
}