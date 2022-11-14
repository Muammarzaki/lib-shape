package lib.shape.shape2d;

/**
 * persegi atau bujur sangkar
 */
public class Square extends Bidang2D {

    private Double s;

    public Square(String name, Double side) {
        this.s = side;
        super.name = name;
    }

    @Override
    public Double getCircumference() {
        return s * 4;
    }

    @Override
    public Double getArea() {
        return Math.pow(s, 2);
    }

    @Override
    public String getName() {
        return super.name;
    }

    public Double[] getSides() {
        Double[] returnSide = new Double[2];
        returnSide[0] = this.s;
        returnSide[1] = this.s;
        return returnSide;
    }

}
