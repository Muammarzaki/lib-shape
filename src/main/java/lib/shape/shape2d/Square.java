package lib.shape.shape2d;

/*
 * persegi atau bujur sangkar
 */
public class Square extends Bidang2D {

    private Double s;

    public Square(String name, Double s) {
        this.s = s;
        super.name = name;
    }

    @Override
    public Double keliling() {
        return s * 4;
    }

    @Override
    public Double luas() {
        return Math.pow(s, 2);
    }

    @Override
    public String getName() {
        return super.name;
    }

    public Double getS() {
        return s;
    }

}
