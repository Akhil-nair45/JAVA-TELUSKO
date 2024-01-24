class A 
{
    public void show()
    {
        for(int i =0; i<=10; i++)
        {
            System.out.println("Hi");
        }
    }
}

class B 
{
    public void show()
    {
        for(int i =0; i<=10; i++)
        {
            System.out.println("Hello");
        }
    }
}


public class Threads {
    public static void main(String[] args) {
        A obj = new A();
        B pbj = new B();
        obj.show();
        pbj.show();
    }
}
