package polymorphism;
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


public class poly {
    public static void main(String[] args) {
        // A obj = new A();
        // obj.show();

        // A obj = new B(); //here on running this code the refernce point is A and object is B, so output will be of B,but the twist is
        // obj.show();

        //so going step by step

        A obj = new A();
        obj.show();

        obj = new B();  //here we are assigning a new object to an old variable and it will override
        obj.show();

        obj = new C();
        obj.show();  //so here the same show is behaving differently with different objects as u can see from the result everytime the same method is called with differnet objects its changing this is known as polymorphism
    }
}
