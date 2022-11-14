package lib.shape.shape2d;

import java.util.UUID;

/**
 * belah ketupat
 */
public class Rhombus extends Bidang2D {

    private Double s;

    private Double[] diagonal = new Double[2];

    public Rhombus(String name, Double sisi, Double... diagonal) {
        this.s = sisi;
        super.name = name;
        this.diagonal = diagonal;
    }

    public Rhombus(Double s, Double... diagonal) {
        this.s = s;
        this.diagonal = diagonal;
        super.name = UUID.randomUUID().toString();
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.shape.shape2d.Shape2D#getCircumference()
     */
    @Override
    public Double getCircumference() {
        return s * 4d;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.shape.shape2d.Shape2D#getArea()
     */
    @Override
    public Double getArea() {
        return 0.5 * diagonal[0] * diagonal[1];
    }

    @Override
    public String getName() {
        return super.name;
    }

    /**
     * get sisi
     * 
     * @return
     */
    public Double getSide() {
        return s;
    }

    /**
     * get diaginal
     * 
     * @return
     */
    public Double[] getDiagonal() {
        return diagonal;
    }

}
