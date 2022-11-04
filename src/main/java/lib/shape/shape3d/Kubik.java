package lib.shape.shape3d;

import java.util.UUID;

public class Kubik extends Bidang3D {

    private Double[] rusuk = new Double[3];

    public Kubik(String name, Double longs, Double widht, Double hight) {
        this.rusuk[0] = longs;
        this.rusuk[1] = widht;
        this.rusuk[2] = hight;
        super.name = name;
    }

    public Kubik(Double longs, Double widht, Double hight) {
        this.rusuk[0] = longs;
        this.rusuk[1] = widht;
        this.rusuk[2] = hight;
        this.name = UUID.randomUUID().toString();
    }

    @Override
    public Double keliling() {
        return rusuk[0] * rusuk[1] * 6;
    }

    @Override
    public Double volume() {
        return rusuk[0] * rusuk[1] * rusuk[2];
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Double[] getRusuk() {
        return rusuk;
    }

}
