import  java.lang.String;

class Mobile{
   private String name;
   private int age;

   public Mobile()
{
    System.out.println("in constructor");
}


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

}

public class Constructor {
    public static void main(String[] args) {
        
  
        Mobile obj = new Mobile();
        Mobile obj1 = new Mobile(); // the reason we are calling two objects are because, if we call two objects two times the constructor will be called so the many times u will call the object it will call the constructor and thats the reason in constructor printed two times
        System.out.println(obj.getName()+" : "+obj.getAge());

        obj.setName("Akhil");
        obj.setAge(22);

        
    }
}
