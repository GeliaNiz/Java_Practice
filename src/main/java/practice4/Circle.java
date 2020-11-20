package practice4;

public class Circle extends Shape {
    double radius;

    Circle() {
        super();
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;

    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "radius: " + getRadius() + " Area: " + getArea() + " Perimeter: " + getPerimeter();
    }

}
