import java.lang.String;
class Computer
{
    public void code()
    {

    }
}

class Laptop extends Computer
{
    public void code()
    {
        System.out.println("coding!!");
    }

    @Override
    public String toString() {
        return "Laptop []";
    }
    
}

class Desktop extends Computer
{
    public void code()
    {
        System.out.println("coding!!");
    }

    @Override
    public String toString() {
        return "Desktop []";
    }
    
}

class Developer
{
    public void devApp(Laptop lap)  //but here the problem is the developer is telling that he will only code on laptop so if company needs to code him in desktop he cant say no so we r making a new class computer and extending it to laptop and desktop and instead of passing laptop we will pass computer and will create an object of computer
    {
        lap.code();
    }
}

public class demooInterface3 {
    public static void main(String[] args) {
        // Laptop lap = new Laptop();
        // Desktop dap= new Desktop();

        Computer lap = new Laptop();
        Computer dap = new Desktop();  // so here we basically tooked a computer instead of laptop or a desktop to avoid tight coupling and to achieve loose coupling
        dap.code();
        lap.code();
        System.out.println(dap);
        System.out.println(lap);
    }
}
