class Triangle {
    double side1, side2, side3;

    // Triangle constructor
    Triangle() {
        this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;
    }

    double calculateArea() {
        double side = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(side * (side - side1) * (side - side2) * (side - side3));
    }

    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
