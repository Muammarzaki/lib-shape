package lib.shape.shape2d;

import java.util.UUID;

/**
 * persegi panjang
 */
public class Rectagle extends Bidang2D {
    private Double[] s = new Double[4];

    public Rectagle(Double... sides) {
        this.s = sides;
        this.name = UUID.randomUUID().toString();
    }

    public Rectagle(String name, Double sideWidht, Double sideHight) {
        this.s[0] = sideWidht;
        this.s[1] = sideHight;
        super.name = name;
    }

    public Rectagle(String name, Double... s) {
        this.s = s;
        super.name = name;
    }

    @Override
    public Double getCircumference() {
        return (s[0] + s[1]) * 2;
    }

    @Override
    public Double getArea() {
        return s[0] * s[1];
    }

    @Override
    public String getName() {
        return this.name;
    }

    /**
     * get side of rectangle
     */
    public Double[] getSides() {
        return s;
    }

}
