package lib.shape.shape2d;

/**
 * @author muammar zaki
 * @since
 *        version 1.0.0
 */
public interface Shape2D extends Comparable<Shape2D> {
    /**
     * get getCircumference of shape
     * 
     * @param s
     * @return
     */
    Double getCircumference();

    /**
     * get getArea of shape
     * 
     * @return
     */
    Double getArea();

    /**
     * get name of shape
     * 
     * @return
     */
    String getName();

    /**
     * @apiNote its compare by area of shape;
     * @apiNote this use for sort and campre of two object shape
     * @param o objeck of shape
     */
    @Override
    default int compareTo(Shape2D o) {
        return this.getArea().compareTo(o.getArea());
    }

}
