package lib.shape.shape3d;

/**
 * bola
 */
public class Ball extends Bidang3D {

    private Double d;

    private Double r;

    public Ball(String name, Double diameter) {
        this.d = diameter;
        this.r = d / 2;
        super.name = name;
    }

    @Override
    public Double getCircumference() {
        return 4d / 3d * Math.PI * Math.pow(r, 2);
    }

    @Override
    public Double volume() {
        return 4d * Math.PI * Math.pow(r, 2);
    }

    @Override
    public String getName() {
        return super.name;
    }

    public Double getD() {
        return d;
    }

    public Double getR() {
        return r;
    }

}
