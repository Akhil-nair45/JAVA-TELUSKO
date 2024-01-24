class A 
{
    public void show()
    {
        System.out.println("in A show");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("in B show");
    }
}

class C extends A
{
    public void show()
    {
        System.out.println("in C show");
    }
}


public class demo1111 {
    public static void main(String[] args) {
        // A obj = new B();  //here we are taking A as a refernce point but we are maing object of class B, also we can say that we are taking refernce point as A and making object of child B
        A obj = new A();
        obj.show();  //it will print

        obj = new B();  
        obj.show();

        obj = new C();
        obj.show();;
    }
}
