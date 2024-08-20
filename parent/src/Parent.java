abstract class Parent {
    abstract void message();
}

class SubClass1 extends Parent {
    @Override
    void message() {
        System.out.println("This is the first subclass");
    }
}

class SubClass2 extends Parent {
    @Override
    void message() {
        System.out.println("This is the second subclass");
    }
}
