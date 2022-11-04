package lib.shape.shape3d;

public abstract class Bidang3D implements Shape3D {
    protected String name;

    @Override
    public String toString() {
        return String.format("%-20s %-15f %-15f", this.name, this.volume(), this.keliling());
    }

}
