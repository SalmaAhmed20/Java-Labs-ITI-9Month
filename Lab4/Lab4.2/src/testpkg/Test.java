package testpkg;

import shapes.Shape;

import java.util.List;


public class Test {
   public static void testDraw(List< ? extends Shape> shapes)
   {
       for (int i = 0; i < shapes.size(); i++) {
           shapes.get(i).draw();
       }

   }
}
