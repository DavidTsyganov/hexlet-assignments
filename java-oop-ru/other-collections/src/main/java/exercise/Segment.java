package exercise;

public class Segment {
    private final Point beginPoint;
    private final Point endPoint;


    public Segment(Point p1, Point p2) {
        this.beginPoint = p1;
        this.endPoint = p2;
    }

    public Point getBeginPoint() {
        return this.beginPoint;
    }

    public Point getEndPoint() {
        return this.endPoint;
    }

    public Point getMidPoint() {
        return new Point((this.beginPoint.getX() + this.endPoint.getX()) / 2,
                    (this.beginPoint.getY() + this.endPoint.getY()) / 2);
    }
}
