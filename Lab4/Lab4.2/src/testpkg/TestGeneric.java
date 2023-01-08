package testpkg;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

import java.util.ArrayList;

public class TestGeneric<U> {
    public  void testDraw(ArrayList<U> shapes)
    {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Rectangle)
                System.out.println("Rectangle");
            else if (shapes.get(i) instanceof Circle)
                System.out.println("Circle");
        }

    }
}
