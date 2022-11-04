package lib.shape;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import lib.shape.shape2d.Cicle;
import lib.shape.shape2d.Parallelogram;
import lib.shape.shape2d.Rectagle;
import lib.shape.shape2d.Rhombus;
import lib.shape.shape2d.Shape2D;
import lib.shape.shape2d.Square;
import lib.shape.shape2d.Triangle;

public class ShapeTest {

    @Test
    void testShape2D() {
        Shape2D sh1 = new Square("kotak1", 5d);
        assertEquals(25d, sh1.luas());
        Shape2D sh2 = new Cicle("lingkaran", 14d);
        assertEquals(154, Math.round(sh2.luas()));
        Shape2D sh3 = new Rectagle("persegi panjang", 4d, 5d);
        assertEquals(20d, sh3.luas());
        Shape2D sh4 = new Parallelogram("jajar genjang", 2d, 3d, 4d);
        assertEquals(8d, sh4.luas());
        Shape2D sh5 = new Rhombus(5d, 4d, 5d);
        assertEquals(10d, sh5.luas());
        Shape2D sh6 = new Triangle(4d, 5d, 6d);
        assertEquals(10d, sh6.luas());
    }

}
