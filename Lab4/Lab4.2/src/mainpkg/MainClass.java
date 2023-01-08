package mainpkg;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import testpkg.Test;
import testpkg.TestGeneric;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Shape> shapes= new ArrayList<>(4);
        shapes.add(new Rectangle());
        shapes.add(new Circle());
        shapes.add(new Rectangle());
        shapes.add(new Circle());
        Test t=new Test();
        t.testDraw(shapes);

        ArrayList<Rectangle> rectangles= new ArrayList<>(4);
        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());

        TestGeneric <Rectangle> testGeneric=new TestGeneric<>();
        testGeneric.testDraw(rectangles);

        ArrayList<Circle > circles= new ArrayList<>(4);
        circles.add(new Circle());
        circles.add(new Circle());
        circles.add(new Circle());
        circles.add(new Circle());
        TestGeneric <Circle> circleTestGeneric=new TestGeneric<>();
        circleTestGeneric.testDraw(circles);
    }
    /*here is  **** */
    /* kjlkjlk /*ssss*/
}
