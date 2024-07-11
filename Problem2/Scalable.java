/**
 * Scalable interface defines a method for scaling objects.
 * It demonstrates that interfaces can have constants.
 */
public interface Scalable {
    double DEFAULT_SCALE_FACTOR = 2.0;  // This is implicitly public, static, and final
    
    /**
     * Scales the object by the given factor.
     * @param factor The scaling factor
     */
    void scale(double factor);
}