package lib.shape.shape2d;

/**
 * @author Muammar zaki
 * @since version 1.0.0
 */
public abstract class Bidang2D implements Shape2D {
    /**
     * @implNote not override this because that make variable hidding
     *           name of shape for identified
     */
    protected String name;

    /**
     * @apiNote this use for get all data of shape and child of shape
     * @return string.format
     */
    @Override
    public String toString() {
        return String.format("nama\t:%-20s%ngetArea\t:%-15f%ngetCircumference:%-15f%n---%n", this.name, this.getArea(),
                this.getCircumference());
    }

}
