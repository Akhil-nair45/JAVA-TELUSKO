 abstract class Car  // first we had declared this class as normal but after creating an abstract method we have to make it abstract class as abstract method can only be used in abstract class, but its not like an abstract class can only have abstract method, it can have normal methods, so we can  create an abstract class which only has abstract methods, and at the same time we can also create an abstract class which has only normal methods, we can have more than one abstract method in an abstract class, but we have to then implement all the abstract methods in the extending or wagonr class inorder to get rid of error, like try to create a method fly in car and then see it will throw an error and u will notice as soon as u will implement it in wagonr class it will go 
{
    public abstract void drive();  //here we have only declared not defined/implemented so we have to make it abstract method

    public void playMusic()
    {
        System.out.println("Play Music");
    }

    
}

class Wagonr extends Car  // here even after extending its showing error till we implement the abstract method, the moment we declare it, the error will go, u can check by removing the drive method as soon as u commend it it will again show the error
{
    public void drive()
    {
        System.out.println("Driving....");
    }

    @Override
    public String toString() {
        return "Wagonr []";
    }
    
    
}


public class Abstract {
    public static void main(String[] args) {
        // Car obj = new Car();  //here its showing error bcoz we cant create an object of an abstract class, but one thing we can do here is as wagonr is extendinf car class we can call that object, but here we can create refernce of an abstract class 
        Car obj = new Wagonr(); // now here on creating an object of wagonr class its not showing any error as its not an abstract class but its extending an abstract class
        obj.drive();  // here it will call the method of wagonr class only as we have implemented it in wagonr class only
        obj.playMusic();
        System.out.println(obj);  // at first we will get output but with hashcode so to get rid of it we have to create or generate toString method in wagonr class, see above we have generated it and then we got the proper output
    }
}
