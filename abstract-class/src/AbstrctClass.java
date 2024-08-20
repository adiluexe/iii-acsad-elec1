abstract class AbstractClass {
    AbstractClass() {
        System.out.println("This is the constructor of the abstract class");
    }

    abstract void a_method();

    void normalMethod() {
        System.out.println("This is the normal method of the abstract class");
    }
}

class SubClass extends AbstractClass {
    @Override
    void a_method() {
        System.out.println("This is an abstract method");
    }
}
