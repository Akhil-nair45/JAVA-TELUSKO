class A {
    public void show() {
        System.out.println("in A show");
    }
}
// now if we want to override this show method or if we want to print in new
// show then we can easil
// do it by creating a new class B and extending it to A and then calling the
// same method and we can do it like that
// but what if we dont want to create a new class in that way we can do is in
// main class we created obj of
// A class and inside curly bracket or say it anonnymous class we can call the
// method and change the data as
// shown below in main class

public class Anonymousclass {
    public static void main(String[] args) {
        A obj = new A()
        {
           public void show()
           {
            System.out.println("in new show");
           }
        };
    

        obj.show();
        //here it is showing an error but it will now show new show in output, the error was we have not to mention  ; this after A() it is after curly brasis ends
    }
}
