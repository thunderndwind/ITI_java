package shapesUtils.shapes;

public abstract class Shape {
    protected Point centralPoint;

    public abstract void draw();

    public Point getCentralPoint() {
        return centralPoint;
    }

    public void setCentralPoint(Point centralPoint) {
        this.centralPoint = centralPoint;
    }
}
