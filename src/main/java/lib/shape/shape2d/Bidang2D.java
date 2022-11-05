package lib.shape.shape2d;

public abstract class Bidang2D implements Shape2D {
    /**
     * name of shape for identified
     */
    protected String name;

    @Override
    public String toString() {
        return String.format("nama\t:%-20s%nluas\t:%-15f%nkeliling:%-15f%n---%n", this.name, this.luas(),
                this.keliling());
    }

}
