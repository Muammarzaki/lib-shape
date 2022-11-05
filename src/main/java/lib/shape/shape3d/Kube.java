package lib.shape.shape3d;

import java.util.UUID;

public class Kube extends Bidang3D {

    private Double[] rusuk = new Double[3];

    public Kube(String name, Double side) {
        this.rusuk[0] = side;
        this.rusuk[1] = side;
        this.rusuk[2] = side;
        super.name = name;
    }

    public Kube(Double side) {
        this.rusuk[0] = side;
        this.rusuk[1] = side;
        this.rusuk[2] = side;

        this.name = UUID.randomUUID().toString();
    }

    @Override
    public Double keliling() {
        return rusuk[0] * rusuk[1] * 6;
    }

    @Override
    public Double volume() {
        return Math.pow(this.rusuk[0], 3);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Double[] getRusuk() {
        return rusuk;
    }

}
