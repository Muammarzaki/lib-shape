package lib.shape.shape2d;

import java.util.UUID;

/**
 * lingkaran
 * 
 */
public class Circle extends Bidang2D {

    private Double d;
    private Double r;

    public Circle(Double diameter) {
        this.d = diameter;
        this.r = diameter / 2;
        super.name = UUID.randomUUID().toString();
    }

    public Circle(String name, Double diameter) {
        this.d = diameter;
        this.r = diameter / 2;
        super.name = name;
    }

    @Override
    public Double getCircumference() {
        return Math.PI * this.r * 2;
    }

    @Override
    public Double getArea() {
        return Math.PI * Math.pow(this.r, 2d);
    }

    /**
     * diameter ligkaran
     * 
     * @return
     */
    public Double getDiameter() {
        return d;
    }

    /**
     * jari jari lingkaran
     * 
     * @return
     */
    public Double getRadius() {
        return r;
    }

    @Override
    public String getName() {
        return name;
    }

}
