//Create a Shape class with a method area() and extend it with Circle and Rectangle classes overriding the area() method appropriately.

// Shape class with an area() method
abstract class Shape {
    abstract double area();
}

// Circle class extending Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

public class part2_task2{
    public static void main(String[] args) {
        // Example usage
        Circle circle = new Circle(5.0);
        System.out.println("Area of the circle: " + circle.area());

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Area of the rectangle: " + rectangle.area());
    }
}
