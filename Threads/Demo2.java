package Threads;

class A extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hi");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello");
        }
    }
}

public class Demo2 {
    public static void main(String[] args) {
        A obj = new A();
        B obj2 = new B();
        // obj.show();
        // obj2.show();  //here we are not calling show method bcoz we are extending the classes to thread and in order to call the method simultaneously we have to use start 
        obj.start();
        obj2.start();  // when u typr start here u have to change the method name to run from show thats how threads start
    }//here if we write 10 in for loop it will seem that its not changed but change to 100 and see the magic

}
