interface A 
{
     void show(int i);
}

public class Lambda {
    public static void main(String[] args) {
        A obj = new A() {
            public void show(int i)
            {
                System.out.println("show");
            }
        };
        obj.show(5);

        //u can either use above or below both of them are same but below is with the help of lambda expression
        // A obj = () -> System.out.println("show");  // this is the way lambda expression can be used and can be made easier the code or u say for code reduction
        // obj.show();
    }
}
