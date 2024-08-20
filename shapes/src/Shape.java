abstract class Shape {
    abstract void RectangleArea(double length, double breadth);

    abstract void SquareArea(double side);

    abstract void CircleArea(double radius);
}

class Area extends Shape {
    @Override
    void RectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of the Rectangle: " + area);
    }

    @Override
    void SquareArea(double side) {
        double area = side * side;
        System.out.println("Area of the Square: " + area);
    }

    @Override
    void CircleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the Circle: " + area);
    }
}
