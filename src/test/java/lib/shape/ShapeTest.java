package lib.shape;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import lib.shape.shape2d.Circle;
import lib.shape.shape2d.Parallelogram;
import lib.shape.shape2d.Rectagle;
import lib.shape.shape2d.Rhombus;
import lib.shape.shape2d.Shape2D;
import lib.shape.shape2d.Square;
import lib.shape.shape2d.Triangle;
import lib.shape.shape3d.Ball;
import lib.shape.shape3d.Block;
import lib.shape.shape3d.Cube;
import lib.shape.shape3d.Shape3D;

public class ShapeTest {

    @Test
    void testShape2D() {
        Shape2D sh1 = new Square("kotak1", 5d);
        assertEquals(25d, sh1.getArea());
        Shape2D sh2 = new Circle("lingkaran", 14d);
        assertEquals(154, Math.round(sh2.getArea()));
        Shape2D sh3 = new Rectagle("persegi panjang", 4d, 5d);
        assertEquals(20d, sh3.getArea());
        Shape2D sh4 = new Parallelogram("jajar genjang", 2d, 3d, 4d);
        assertEquals(8d, sh4.getArea());
        Shape2D sh5 = new Rhombus(5d, 4d, 5d);
        assertEquals(10d, sh5.getArea());
        Shape2D sh6 = new Triangle(4d, 5d, 6d);
        assertEquals(10d, sh6.getArea());
        List.of(sh1, sh2, sh3, sh4, sh5, sh6).forEach(System.out::print);
    }

    @Test
    void testShape3D() {
        // cube
        Shape3D sh1 = new Cube("kotak 1", 5d);
        assertEquals(125, sh1.volume());
        assertEquals("kotak 1", sh1.getName());
        assertEquals(150, sh1.getCircumference());

        // block
        Shape3D sh2 = new Block("balok 1", 4d, 5d, 2d);
        assertEquals(40d, sh2.volume());
        assertEquals("balok 1", sh2.getName());
        assertEquals(100d, sh2.getCircumference());
        // ball
        Shape3D sh3 = new Ball("bola", 14d);

    }
}
