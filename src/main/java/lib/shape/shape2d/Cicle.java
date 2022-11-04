package lib.shape.shape2d;

import java.util.UUID;

/*
 * lingkaran
 * 
 */
public class Cicle extends Bidang2D {

    private Double d;
    private Double r;

    public Cicle(Double d) {
        this.d = d;
        this.r = d / 2;
        super.name = UUID.randomUUID().toString();
    }

    public Cicle(String name, Double d) {
        this.d = d;
        this.r = d / 2;
        super.name = name;
    }

    @Override
    public Double keliling() {
        return Math.PI * this.r * 2;
    }

    @Override
    public Double luas() {
        return Math.PI * Math.pow(this.r, 2d);
    }

    /**
     * diameter ligkaran
     * 
     * @return
     */
    public Double getD() {
        return d;
    }

    /**
     * jari jari lingkaran
     * 
     * @return
     */
    public Double getR() {
        return r;
    }

    @Override
    public String getName() {
        return name;
    }

}
