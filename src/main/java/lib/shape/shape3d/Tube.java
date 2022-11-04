package lib.shape.shape3d;

import lib.shape.shape2d.Cicle;

public class Tube extends Bidang3D {
    private Double d;
    private Double t;

    public Tube(String name, Double d, Double t) {
        this.d = d;
        this.t = t;
        super.name = name;
    }

    @Override
    public Double keliling() {
        return null;
    }

    @Override
    public Double volume() {
        return new Cicle(d).luas() * t;
    }

    @Override
    public String getName() {
        return super.name;
    }

}
