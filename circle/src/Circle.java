class Circle {
    double radius;
    double pi = 3.14;

    Circle() {
        this.radius = 1.0;
        this.pi = 3.14;
    }

    double calculateCircumference() {
        return 2 * pi * radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }
}