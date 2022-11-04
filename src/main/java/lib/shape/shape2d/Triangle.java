package lib.shape.shape2d;

import java.util.UUID;

/*
 * segitiga
 */
public class Triangle extends Bidang2D {
    private Double[] s = new Double[3];

    public Triangle(String name, Double sisiBawah, Double sisiTegak, Double sisiMiring) {
        super.name = name;
        this.s[0] = sisiBawah;
        this.s[1] = sisiTegak;
        this.s[2] = sisiMiring;
    }

    public Triangle(Double sisiBawah, Double sisiTegak, Double sisiMiring) {
        super.name = UUID.randomUUID().toString();
        this.s[0] = sisiBawah;
        this.s[1] = sisiTegak;
        this.s[2] = sisiMiring;
    }

    /**
     * @deprecated
     * @param a
     * @param b
     * @param c
     * @throws Exception
     */
    @Deprecated
    protected void trigonomety(Double a, Double b, Double c) throws Exception {
        if (a != null && b != null && c != null) {
            // dont do anything
        } else if (a == null && b != null && c != null) {
            this.s[0] = Math.sqrt((c * c) - (b * b));
        } else if (a != null && b == null && c != null) {
            this.s[1] = Math.sqrt((c * c) - (a * a));
        } else if (a != null && b != null) {
            this.s[2] = Math.sqrt((a * a) + (b * b));
        } else {
            System.out.println(this.s[0] + " " + this.s[1] + " " + this.s[2]);
            throw new Exception("must have min 2 params of sisi");
        }
    }

    @Override
    public Double keliling() {
        
        return s[0] + s[1] + s[2];
    }

    @Override
    public Double luas() {
        return s[0] * s[1] * 0.5;
    }

    @Override
    public String getName() {
        return name;
    }

    public Double getSisiBawah() {
        return s[0];
    }

    public Double getSisiTegak() {
        return s[1];
    }

    public Double getSisiMiring() {
        return s[2];
    }

}
