package lib.shape.shape2d;

import java.util.UUID;

/**
 * jajar genjang
 */
public class Parallelogram extends Bidang2D {

    private Double[] a = new Double[3];

    public Parallelogram(String name, Double leghtSide, Double widhtSide, Double hightSide) {
        this.a[0] = leghtSide;
        this.a[1] = widhtSide;
        this.a[2] = hightSide;
        super.name = name;
    }

    public Parallelogram(Double LeghtSide, Double widhtSide, Double hightSide) {
        this.a[0] = LeghtSide;
        this.a[1] = widhtSide;
        this.a[2] = hightSide;
        super.name = UUID.randomUUID().toString();
    }

    @Override
    public Double getCircumference() {

        return 2 * a[0] * a[1];
    }

    @Override
    public Double getArea() {
        return a[0] * a[2];
    }

    @Override
    public String getName() {
        return super.name;
    }

    public Double getLenght() {
        return a[0];
    }

    public Double geWidht() {
        return a[1];
    }

    public Double gethight() {
        return a[2];
    }

}
