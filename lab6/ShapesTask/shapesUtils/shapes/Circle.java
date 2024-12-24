package shapesUtils.shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.initializeCentralPoint();
    }

    private void initializeCentralPoint() {
        this.centralPoint = new Point(0, 0);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius: " + this.radius);
        System.out.println("Central Point: " + this.centralPoint);
    }
}
