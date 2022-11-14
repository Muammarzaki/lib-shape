package lib.shape.shape3d;

public abstract class Bidang3D implements Shape3D {
    protected String name;

    @Override
    public String toString() {
        return String.format("nama\t:%-20s%ngetArea\t:%-15fgetCircumference:%-15f%n---%n", this.name, this.volume(),
                this.getCircumference());
    }

}
