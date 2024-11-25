// Main.java
abstract class Shape {
    abstract double area(); // Abstract method for area
}

class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Circle extends Shape {
    Point center;
    double radius;

    Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    Point corner;
    double sideLength;

    Square(Point corner, double sideLength) {
        this.corner = corner;
        this.sideLength = sideLength;
    }

    @Override
    double area() {
        return sideLength * sideLength;
    }
}

public class Main {

    static double sumArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.area();
        }
        return sum;
    }

    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(new Point(1.8, -20), 2),
            new Square(new Point(100, 2.1), 5.4),
            new Circle(new Point(0, 0), 1),
            new Circle(new Point(4, 9.123), 98.32),
            new Square(new Point(-321, 0), 0.02)
        };

        System.out.println(sumArea(shapes));
    }
}
