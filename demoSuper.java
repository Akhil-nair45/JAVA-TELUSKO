class A //super class
{
    public A(){
        System.out.println("A is constructed");
    }
}

class B extends A  //sub class
{
    public B()  //default constructor
    {
        System.out.println("B is constructed");
    }

    public B(int n)
    {
        System.out.println("in b paramterised constructor"); //here it wont first as we are just calling B object without any paramter, as soon as we again call the b as object with parameter we can see the paramterised constructor is also called( B obj1 = new B(n); write this and see the magic!)
    }
}


public class demoSuper {
    public static void main(String[] args) {
        // A a  = new A();
        B b = new B();  //here u will notice a strange thing on running, a is also called as sub class and super class both are called, thus both the constructors are called 
        B obj = new B(5);  // this is for parameterised constructor now u will see the paramterside constructor is called
    }
}
