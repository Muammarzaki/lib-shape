package lib.shape.shape2d;

import java.util.UUID;

/*
 * jajar genjang
 */
public class Parallelogram extends Bidang2D {

    private Double[] a = new Double[3];

    public Parallelogram(String name, Double sisibawah, Double sisiMiring, Double tinggi) {
        this.a[0] = sisibawah;
        this.a[1] = sisiMiring;
        this.a[2] = tinggi;
        super.name = name;
    }

    public Parallelogram(Double sisibawah, Double sisiMiring, Double tinggi) {
        this.a[0] = sisibawah;
        this.a[1] = sisiMiring;
        this.a[2] = tinggi;
        super.name = UUID.randomUUID().toString();
    }

    @Override
    public Double keliling() {

        return 2 * a[0] * a[1];
    }

    @Override
    public Double luas() {
        return a[0] * a[2];
    }

    @Override
    public String getName() {
        return super.name;
    }

    public Double getA() {
        return a[0];
    }

    public Double getB() {
        return a[1];
    }

    public Double getT() {
        return a[2];
    }

}
