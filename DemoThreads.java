class A {
    public void show() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("hi");
        }
    }
}

class B {
    public void show() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello");
        }
    }
}

public class DemoThreads {
    public static void main(String[] args) {
        A obj = new A();
        B obj2 = new B();

        obj.show();
        obj2.show();

    }
}
