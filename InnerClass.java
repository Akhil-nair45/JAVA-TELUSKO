class A 
{
    int age;
    public void show()
    {
        System.out.println("in A show");
    }

    class B // here B is inner class
    {
        public void config()
        {
            System.out.println("in B config");
        }
    }
}



public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();  // here we can create an object of A class, what if we want to create obj of inner class B
        // B obj2 = new B(); // here its showing error as B class is inner class of A, so we have to write in below way
        A.B obj2 =  obj.new B();  // here we have added obj.new bcoz if we want to get B we have to call obj of A first, bcoz if we want to call class B we have to call the object A as its a non static method
        obj2.config();
        System.out.println(obj);
        System.out.println(obj2);
        //static can be used only for inner class
    }
}
