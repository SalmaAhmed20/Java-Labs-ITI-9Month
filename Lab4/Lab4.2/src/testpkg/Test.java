package testpkg;

import shapes.Shape;

import java.util.ArrayList;

public class Test {
   public  void testDraw(ArrayList<Shape>shapes)
   {
       for (int i = 0; i < shapes.size(); i++) {
           shapes.get(i).draw();
       }

   }
}
