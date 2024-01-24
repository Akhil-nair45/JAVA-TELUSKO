import java.lang.String;

class Laptop
{
    String model;
    int price;

    public String toString()
    {
        return(model+" : "+ price);
    }
}


public class objectclass {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model="Lenovo";
        obj.price=112250;
        // System.out.println(obj.toString());  //here even if u dont write tostring method it is automatically called bydefault
        //now if we create a method in class laptop just to see whether its true or not without writing. to string manually and if it is called then we can say that it is automatially called and we can return anything we want from there
        System.out.println(obj);
        //now on creating a method in the class u can see now its returning a value
    }
}
