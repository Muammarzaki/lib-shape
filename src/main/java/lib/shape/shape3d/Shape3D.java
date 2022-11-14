package lib.shape.shape3d;

public interface Shape3D extends Comparable<Shape3D> {
    /**
     * @return
     */
    Double getCircumference();

    /**
     * volume of shape3d
     * 
     * @return
     */
    Double volume();

    /**
     * get name
     * 
     * @return
     */
    String getName();

    @Override
    default int compareTo(Shape3D o) {
        return this.volume().compareTo(o.volume());
    }

}
