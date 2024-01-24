
//Here we are calling a simple obj and returning the value but to understand it further view encapsulation2


class Human
{
    String name;
    int age;
    

    public void show()
    {
        System.out.println(name+" : "+ age);
    }

}


public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.name="Akhil";
        obj.age=22;

        obj.show();
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
