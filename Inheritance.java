
public class Inheritance {
    public static void main(String[] args) {
        // Claculatorinheritance obj = new Claculatorinheritance();
        // AdvanceCalcinheritance obj = new AdvanceCalcinheritance();
        VeryAdvCalculatorinheritance obj = new VeryAdvCalculatorinheritance();
        // int r1= obj.add(4, 5);
        // int r2= obj.sub(5, 2);

        // System.out.println(r1);
        // System.out.println(r2);

        //we can also use this method, the above method also we can use
        // System.out.println(obj.add(5, 4));
        // System.out.println(obj.sub(5, 2));


        //for advance obj the above were for the calc only
        // System.out.println(obj.add(5, 4));
        // System.out.println(obj.sub(5, 2));
        // System.out.println(obj.mul(5, 3));
        // System.out.println(obj.div(5, 4));

        //now we are creating an object for the veryadvancecalc which is also extended by advcalc so result is
         System.out.println(obj.add(5, 4));
        System.out.println(obj.sub(5, 2));
        System.out.println(obj.mul(5, 3));
        System.out.println(obj.div(5, 4));
        System.out.println(obj.power(5, 1));
    }
}
