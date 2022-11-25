package exercise;

class Segment {
    private Point startPoint;
    private Point endPoint;

    public Segment(Point beginPoint, Point endPoint) {
        this.startPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public Point getMidPoint() {
        int x = (startPoint.getX() + endPoint.getX()) / 2;
        int y = (startPoint.getY() + endPoint.getY()) / 2;
        return new Point(x, y);
    }
}
