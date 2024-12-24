package shapesUtils.test;

import java.util.ArrayList;
import shapesUtils.shapes.Shape;

public class ShapeTest {

    public static void drawShapes(ArrayList<? extends Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

}
