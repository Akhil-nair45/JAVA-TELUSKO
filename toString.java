import java.lang.String;
class Laptop
{
    String brand;
    int price;

    // public String toString()
    // {
    //     return(brand+" : "+price);
    // }  //we dont have to print it manually we can use source action and generate toString method

    

    @Override  //auto generated due to source action
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Laptop [brand=" + brand + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
    
}

public class toString {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.brand="Lenovo";
        obj.price=55000;

        Laptop obj2 = new Laptop();
        obj2.brand="Hp";
        obj2.price=45000;

        Laptop obj3 = new Laptop();
        obj3.brand="Lenovo";
        obj3.price=55000;

         boolean result = obj == obj2; // we also have another method to comapre as below
         System.out.println(result);

        boolean result2 = obj.equals(obj3);
        System.out.println(result2);
    }
}
