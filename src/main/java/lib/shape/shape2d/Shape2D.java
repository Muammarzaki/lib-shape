package lib.shape.shape2d;

/**
 * @author muammar zaki
 * 
 */
public interface Shape2D extends Comparable<Shape2D> {
    /**
     * get keliling of shape
     * 
     * @param s
     * @return
     */
    Double keliling();

    /**
     * get luas of shape
     * 
     * @return
     */
    Double luas();

    /**
     * get name of shape
     * 
     * @return
     */
    String getName();

    @Override
    default int compareTo(Shape2D o) {
        return this.luas().compareTo(o.luas());
    }

}
