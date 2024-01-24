interface A     // Also interface is not a class and this is the most important difference between abstract class and interface, also we cant create object of Interface
{
    void show(); //the reason why here there is no error is bcoz in interface by default the methods are public default, so even if u dont write it they are going tp be the same, so here we have started from void and its still not giving any error 
    void config();
}

class B implements A{       //here one interface can implement another class and if implements then the class should implement all the method else it will be declared as an abstract class

    @Override
    public void show() {
       System.out.println("in B show");
    }

    @Override
    public void config() {
       System.out.println("in B config");
    }
    
}

public class demoInterface {
    public static void main(String[] args) {
        A obj ;
        obj= new B();  // we can create object like this too
        obj.show();
        obj.config();
        System.out.println(obj);
    }
    
}
