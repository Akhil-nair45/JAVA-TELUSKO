import java.lang.String;
class A extends Object  //here even if we are not extending it is automatically extending obj, its java feature same like super even if u r not mentioning it is ther!
{
    public A()
    {
        //so when we say super in A class its basically calling the constructor of object class, so in short B class  extends A, And A class Extends Object class
        super(); //by default every constructor will have super, even i u dont mention its their
        System.out.println("in A");
    }

    public A(int n)
    {
        super(); //by default every constructor will have super, even i u dont mention its their
        System.out.println("in A paramterised");  //here u will notice even after calling object b with paramaterised the A class parameterised is not called, the reason is because of super every constructor in java  by defualt has super(); so even if u dont write it it will be using it only and u can also write that if u want
    }

}

class B extends A
{
    public B()
    {
        super(); //by default every constructor will have super, even i u dont mention its their
        System.out.println("in B");
    }

    public B(int n)
    {
        //here we are explixitly we have to mention super
        super(n); //by default every constructor will have super, even i u dont mention its their, but here in order to print A paramtersied constructor we have to manually pass the parmater, the same which we are passing in the class B, and now on calling or running the program u can see the A parameterised construtor is been called
        System.out.println("in B paramterised");
    }
}

public class demoSuperr {
    public static void main(String[] args) {
       
        B b = new B();  
        B obj = new B(5);  //so if we want to call paramterised constructor of A, then we have to write super(n) or pass the parameter in super in order to print A parameterised constructor
    }
}

//so if we want B default const with A parameterised const just pass paramter in super in b thus it will call A paramterised 