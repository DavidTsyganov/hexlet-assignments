package exercise;

public class Circle {
    private final Point point;
    private final int radius;

    public Circle(final Point point, final int radius) {
        this.point = point;
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public float getSquare() throws NegativeRadiusException {
        if (this.radius < 0) {
            throw new NegativeRadiusException("Не удалось посчитать площадь");
        }
        return (float) (Math.PI * this.radius * this.radius);
    }

}
