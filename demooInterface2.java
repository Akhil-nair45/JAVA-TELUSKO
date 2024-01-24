import java.lang.String;
interface A 
{
    int pincode = 382475;
    String area="Ahmedabad";
    void show();
    void config();
}
interface X 
{
    void run();
}

interface Y extends X
{
    
}

class B implements A,Y //X as we extende x into y  //here in interface we can implement more than one interface in one class
{

    @Override
    public void run() {
        System.out.println("in B running!");
    }

    @Override
    public void show() {
        System.out.println("in B show");
    }

    @Override
    public void config() {
        System.out.println("in B config");
    }

    @Override
    public String toString() {
        return "B []";
    }
    
    
}

public class demooInterface2 {
    public static void main(String[] args) {
        A obj;
        obj= new B();
        obj.config();
        obj.show();
        System.out.println(obj);

        X obj2;
        obj2= new B();
        obj2.run();
        System.out.println(obj2);
    }
}
