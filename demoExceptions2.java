public class demoExceptions2 {   // we are creating multiple try catch block
public static void main(String[] args) {
     int i = 2;
     int j = 0;

     String str = null;

     int nums[] = new int[5];  // here we have decalared an array of 5 elements

     try {
        j = 18/i;  //if here error comes then it will directly throw to catch block the remaining sout wont occur
      System.out.println(str.length());  // now here we have tooked a variable and we have given it null, here we are not taking any manual catch block but we have made a catch block exception for remaining every exceptions and we have also printed there e so it will also give us the name of the exception and it will give null pointer exception on running now u can create a manual catch block with null pointer exception and u can print ur own message this way exception handling works!
        System.out.println(nums[1]);  // here we are printing second element of array as array starts with 0 so 1 will be the second element
        System.out.println(nums[5]);  //here we are printing 6 th element of array but it will give an error of out of bound as array is 5 in length and we are printing 6th element
    } catch (ArithmeticException e) {  //here we have created multiple catch block for particular exception ans this will be called if particular exception will occur
        System.out.println("Bye"+" : "+e);
     }
     catch (ArrayIndexOutOfBoundsException e)  // here u can change the value of i from 0 to 4 and u can see the exception also changes 
     {
        System.out.println("Tata"+ " : "+ e);
     }
     catch( Exception e)
     {
        System.out.println("Something went wrong!"+" : "+ e);  // this will call when there is other exception coming other than arithmetic and array out of bound exception in such case this catch block will be executed
     }
}
}
