package Threads;
class A extends Thread
{
     public void run()  
    {
        for(int i=0; i<=10; i++)
        {
            System.out.println("Hi");
        }
    }
}

class B extends Thread
{
     public void run()  
    {
        for(int i=0; i<=10; i++)
        {
            System.out.println("Hello");
        }
    }
}
public class demo3 {
    public static void main(String[] args) {
        A obj = new A();
        B obj2 = new B();
        obj.start();
        obj2.start();
    }
}
