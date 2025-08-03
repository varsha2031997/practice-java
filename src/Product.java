//price ascending rating descending
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Product {

    int id;
    double price;
    int rating;


    Product(int id,double price, int rating)
    {
        this.id= id;
        this.price= price;
        this.rating=rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }


    public static void main(String[] args) {

        List<Product> prods = new ArrayList<>();
        prods.add(new Product(10,10000,3));
        prods.add(new Product(12,30000,4));
        prods.add(new Product(15,60000,5));
        prods.add(new Product(17,80000,8));
        prods.add(new Product(19,10000,9));

        Comparator<Product> productComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                int priceCompare = Double.compare(o1.price, o2.price);
                if(priceCompare == 0)
                {
                    return Integer.compare(o2.rating, o1.rating);
                }
                return  priceCompare;
            }

        };

        Collections.sort(prods,productComparator);
        for(Product product : prods)
        {
            System.out.println(product);
        }




    }
}
