
public class demoException {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;  // here we can change to value to and u can see it will give an exception, and it is arithmetic exception and we need to catch that exception and so if we are giving j =4; its not showing the error but as soon as we are giving it 0 it is throwing an error thus we can say it printing catch block statement else it wont print that statement if we are giving j=4

        try 
        {
            j = 18/i;
        } 
        catch (Exception e) 
        {
            System.out.println("Something went wrong!" + e);
        }

        //we can have multiple try catch statement try is basically a mediate it will verify the conditions if ok it will pass else it will pass to catch and catch block executes
        System.out.println(j);
        System.out.println("Bye");
    }
}
