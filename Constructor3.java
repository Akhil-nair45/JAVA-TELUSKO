//in this we are going to learn default/normal constructor and paramterized constructor
import java.lang.String;
class Human
{
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public Human()  //default constructor
    {
        name="Akhil";
        age=22;
    }

    public Human(int a , String n)  //parametrized constructor as we are apssing the paramater here in the constructor
    {
        age=a;
        name=n;
    }

    
}
public class Constructor3 {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj2= new Human(21,"shailesh");

        System.out.println(obj.getName()+" : "+ obj.getAge());
        System.out.println(obj2.getName()+ " : "+obj2.getAge());
    }
}
