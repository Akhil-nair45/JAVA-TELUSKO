//here we want to print in A, in B, in B paramtersised as seen in the previous example demosuperr.java, we have done using super but what if we want both the constructor of the same class, this is where this keyword comes in
import java.lang.String;
class A 
{
    public A()
    {
        super();
        System.out.println("in A");
    }

    public A(int n)
    {
        super();
        System.out.println("in A parameterised");
    }
}

class B extends A
{
    public B() 
    {
        super();
        System.out.println("in B");
    }

    public B(int n)
    {
        this(); //so here by giving this we r calling both the constructor of the same class and due to which A is also called
        // super();
        System.out.println("in B parameterised");
    }
}


public class demoSuperrr {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
//here we have written this in the b parmaterised due to which it will call the constructor of the same class and as B class is super to A it will call A , so A will be called and then B and then B parameterised