public class Main {
    public static void main(String[] args) {

        System.out.println("\nGroup 8\n");
        Circle circle1 = new Circle();
        System.out.println("Circumference of Circle1: " + circle1.calculateCircumference());

        Circle circle2 = new Circle();
        circle2.setRadius(5.0);
        System.out.println("Circumference of Circle2: " + circle2.calculateCircumference());
    }
}