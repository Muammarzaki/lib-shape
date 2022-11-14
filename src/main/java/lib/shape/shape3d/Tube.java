package lib.shape.shape3d;

/**
 * tabung
 */
import lib.shape.shape2d.Circle;

public class Tube extends Bidang3D {
    private Double d;
    private Double t;
    private Circle side;

    public Tube(String name, Double baseDiameter, Double hight) {
        this.d = baseDiameter;
        this.t = hight;
        super.name = name;
        this.side = new Circle(baseDiameter);
    }

    @Override
    public Double getCircumference() {
        return this.side.getCircumference() * (side.getRadius() + this.t);
    }

    /**
     * get luas permukaan tanpa tutup
     * 
     * @return
     */
    public Double uncoveredSurfaceArea() {
        return side.getArea() + side.getCircumference() * t;
    }

    @Override
    public Double volume() {
        return side.getArea() * t;
    }

    @Override
    public String getName() {
        return super.name;
    }

    /**
     * @return the d
     */
    public Double getDiameter() {
        return d;
    }

    /**
     * @return the t
     */
    public Double getHight() {
        return t;
    }

    /**
     * @return
     * 
     */
    public Circle getSide() {
        return this.side;
    }

    /**
     * get luas selimut
     * 
     * @return
     */
    public Double tubeBlanket() {
        return side.getCircumference() * t;
    }
}
