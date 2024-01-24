import  java.lang.String; //this line needs to be imported everytime u are do the code else it will show u the error error: incompatible types: java.lang.String cannot be converted to String
//      private String name="Navin";
//                          ^
// 1 error
class Human{
    private String name;
    private int age;


    public void setName(String a)
    {
        name=a;
    }
    public String getName()
    {
        return name;
    }

    public void setAge(int b)
    {
        age=b;
    }
    public int getAge()
    {
        return age;
    }

}

public class Encapsulation3 {
    public static void main(String[] args) {
        Human obj = new Human();

        obj.setName("Akhil");
        obj.setAge(22);

        System.out.println(obj.getName()+" : "+obj.getAge());
    }
}
