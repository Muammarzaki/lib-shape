package lib.shape.shape2d;

public abstract class Bidang2D implements Shape2D {
    /**
     * name of shape for identified
     */
    protected String name;

    @Override
    public String toString() {
        return String.format("%-20s %-15f %-15f", this.name, this.luas(), this.keliling());
    }

}
