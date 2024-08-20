public class Main {
    public static void main(String[] args) {
        Parent obj1 = new SubClass1();
        Parent obj2 = new SubClass2();

        System.out.println("\nGroup 8\n");
        obj1.message();
        obj2.message();
    }
}
