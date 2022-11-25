package exercise;

public class Flat implements Home {
    private double area;
    private int floor;
    private double balconyArea;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.floor = floor;
        this.balconyArea = balconyArea;
    }
    @Override
    public double getArea() {
        return area + balconyArea;
    }

    @Override
    public int compareTo(Home another) {
        if (this.getArea() > another.getArea()) {
            return 1;
        } else if (another.getArea() > this.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return "Квартира площадью " + getArea() + " метров на "
                + floor + " этаже";
    }
}
