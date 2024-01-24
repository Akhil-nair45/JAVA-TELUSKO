class AkhilException extends Exception                // even after creating Akhilexception class its still showing error in throw becasuse we r still not extending with the parent class which is Exception class, so now as soon as we extend Exception the error will bw gone, so now u can try it by removing extends exception and then check what will happen
{
    public AkhilException(String str)  // here we are apssing the paramter as we want to print something
    {
        super(str);  // here we have mentioned the super statement as we have a parent class and we want to print the thing in the try block
    }  // here if we are not using super then it will only show exception class name that is akhil exception will be shown but we want to print the message which we have passed in the try block   
}


public class CustomException {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j= 18/i;
            if(j==0)
            {
                throw new AkhilException("This is my custom exception!");  // but here on creating manual exception it will show erroe so u have to basically create a class of manual exception so we r now creating a class of custom exception at top
            }
            
        }
        catch(AkhilException e)
        {
            System.out.println("thats the Akhil Exception"+ e);
        } catch(ArithmeticException e){
            System.out.println("this is the catched exception from throw"+e);
        } catch (Exception e) {
            System.out.println("Something went wrong!"+e);
        }

    }
}
