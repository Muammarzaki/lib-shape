package lib.shape.shape3d;

import java.util.UUID;

/**
 * kubus
 */
public class Cube extends Bidang3D {

    private Double rusuk;

    public Cube(String name, Double side) {
        this.rusuk = side;
        super.name = name;
    }

    public Cube(Double side) {
        this.rusuk = side;

        this.name = UUID.randomUUID().toString();
    }

    @Override
    public Double getCircumference() {
        return Math.pow(rusuk, 2) * 6;
    }

    @Override
    public Double volume() {
        return Math.pow(this.rusuk, 3);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Double[] getRusuk() {
        Double[] returnRusuk = new Double[3];
        returnRusuk[0] = this.rusuk;
        returnRusuk[1] = this.rusuk;
        returnRusuk[2] = this.rusuk;
        return returnRusuk;
    }

}
