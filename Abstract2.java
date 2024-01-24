//here we arer creating 2 abstract methods in car but we are declaring here wagonr class also abstract


abstract class Car
{
    public abstract void drive();
    public abstract void fly();
    public void playMusic()
    {
        System.out.println("Playing Music!");
    }
}

abstract class WagonR extends Car  //here we are extending car class but we only want to implement drive method not the fly method so we have to declare it abstract and now we will have to create new class to create an object as we now cant create object of wagonr class as it is also now an abstract class
{
    public void drive()
    {
        System.out.println("Driving....");
    }

}

class updateWagonR extends WagonR  // we created a new class to create an object as discussed earlier(it is alsi known as concrete class, there are two types of class abstract class and concrete class)
{

    @Override
    public void fly() {
        System.out.println("Flying!!!!!");
    }
      

   
    
}


public class Abstract2 {
    public static void main(String[] args) {
        Car obj = new updateWagonR();
        obj.drive();
        obj.fly();
        obj.playMusic();
        System.out.println("obj");
    }
}
