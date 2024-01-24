package Threads;

class A 
{
    public void show()  //changed the method to run to execute 
    {
        for(int i=0; i<=10; i++)
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
public class Demo1 {
    public static void main(String[] args) {
        A obj = new A();
        B obj2 = new B();
        obj.show();
        obj2.show();
    }
}
//here firdt it will execute A method and then it will go to second method but we want to execute it parallaly so we use threads to execute multiple thing simultaneously   