class SuperClass {
    void run() {
        System.out.println("Super class is running");
    }
}

class SubClasss extends SuperClass {
    @Override
    void run() {
        System.out.println("Sub class is running safely");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        SuperClass obj = new SubClasss();
        obj.run();
    }
}
