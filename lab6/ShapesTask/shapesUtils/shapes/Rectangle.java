package shapesUtils.shapes;

public class Rectangle extends Shape {
    private double width;
    private double height;

    private Point rightUp;
    private Point rightDown;
    private Point leftUp;
    private Point leftDown;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        calculateCorners();
        initializeCentralPoint();
    }

    private void calculateCorners() {
        this.rightUp = new Point(this.width / 2, this.height / 2);
        this.rightDown = new Point(this.width / 2, -this.height / 2);
        this.leftUp = new Point(-this.width / 2, this.height / 2);
        this.leftDown = new Point(-this.width / 2, -this.height / 2);
    }

    private void initializeCentralPoint() {
        this.centralPoint = new Point(0, 0);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle corners at:");
        System.out.println("Right Up: " + this.rightUp);
        System.out.println("Right Down: " + this.rightDown);
        System.out.println("Left Up: " + this.leftUp);
        System.out.println("Left Down: " + this.leftDown);
    }
}
