class Mobile{
    String brand;
    int price;
    String category;

    public void show()
    {
        System.out.println(brand + ":" + price + ":" + category);
    }
}


public class Static {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand="Apple";
        m1.price=1500;
        m1.category="SmartPhone";

        Mobile m2= new Mobile();
        m2.brand="Samsung";
        m2.price=1000;
        m2.category="SmartPhone";

        m1.show();
        m2.show();

    }
}
