//here we are taking the variable as private but we are declaring it now third part im encapsulation3


import java.lang.String; //this was pasted because it was showing some string error like this:https://stackoverflow.com/questions/48458528/error-incompatible-types-java-lang-string-cannot-be-converted-to-string
class Human
{
     private String name="Navin";
    private int age=22;

    //here we re creating a private variable so it cant be directly called, so we have to create a getter setter method to get it

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
}




public class Encapsulation2 {
    public static void main(String[] args) {
        Human obj = new Human();
        // obj.name="navin";
        // obj.age=22;       //we cant use this method as variables are decalred private so we have to write as beloew


        System.out.println(obj.getName()+" : "+ obj.getAge());
    }

}
