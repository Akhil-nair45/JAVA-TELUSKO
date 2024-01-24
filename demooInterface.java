import java.lang.String ;
interface A 
{

    int age=44;   //here by default we can only decalare the variable and its final and static by default
    String area="Ahmedabad";
    void show();
    void config();
}

class B implements A
{

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




public class demooInterface {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        System.out.println(obj);
        System.out.println(A.age);
    }
    
}
