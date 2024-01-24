import java.util.Scanner;

public class UserInputfromScanner {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);  // scanner class is used to take input from user before scanner class people used to print user details from buffer reader and input stream, now after java introduced scanner class it is easy for the developers to take input from users
        int num = sc.nextInt();
        System.out.println(num);
    }
}
