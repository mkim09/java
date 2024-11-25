// Point.java
public class Point {
    public final double x;
    public final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    public Point translateX(double x) {
        return new Point(this.x + x, this.y);
    }

    public Point translateY(double y) {
        return new Point(this.x, this.y + y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
