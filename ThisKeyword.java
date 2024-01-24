import java.lang.String; 
class Mobile
{
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name; //this keyword will 
    }
    public void setAge(int age) {
        this.age = age;
    }

    
}


public class ThisKeyword {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.setName("Akhil");
        obj.setAge(22);

        System.out.println(obj.getName()+" : "+obj.getAge());
    }
}
