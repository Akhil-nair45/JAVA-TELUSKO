public class throwExceptions3 {
    public static void main(String[] args) {
        int i =20;
        int j =0;

        try {
            j=18/i;
            if(j==0)
            {
                throw new ArithmeticException();  // here we are throwing the exception manually and catching it in catch block and u can see that it is printing that particular message of the block, so in simple words u r trying to create an error manually and then catching it and printing the message u want
            }
        }
        catch(ArithmeticException e){
            System.out.println("this is the catched exception from throw"+e);
        } catch (Exception e) {
            System.out.println("Something went wrong!"+e);
        }
    }
}
