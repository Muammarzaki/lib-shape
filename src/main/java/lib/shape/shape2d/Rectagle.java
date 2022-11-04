package lib.shape.shape2d;

import java.util.UUID;

/*
 * persegi panjang
 */
public class Rectagle extends Bidang2D {
    private Double[] s = new Double[4];

    public Rectagle(String name, Double s) {
        this.s[0] = s;
        this.s[1] = s;
        super.name = name;
    }

    public Rectagle(Double... s) {
        this.s = s;
        this.name = UUID.randomUUID().toString();
    }

    public Rectagle(String name, Double s1, Double s2) {
        this.s[0] = s1;
        this.s[1] = s2;
        super.name = name;
    }

    public Rectagle(String name, Double... s) {
        this.s = s;
        super.name = name;
    }

    @Override
    public Double keliling() {
        return (s[0] + s[1]) * 2;
    }

    @Override
    public Double luas() {
        return s[0] * s[1];
    }

    @Override
    public String getName() {
        return this.name;
    }

    /**
     * get side of rectangle
     */
    public Double[] getS() {
        return s;
    }

}
