package shapesUtils.app;

import java.util.ArrayList;
import shapesUtils.shapes.Circle;
import shapesUtils.shapes.Rectangle;
import shapesUtils.shapes.Shape;
import shapesUtils.test.ShapeTest;

public class App {

	public static void start() {
		Shape rectangle = new Rectangle(6, 4);

		Shape circle = new Circle(4);

		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(rectangle);
		shapes.add(circle);

		ShapeTest.drawShapes(shapes);
	}

}