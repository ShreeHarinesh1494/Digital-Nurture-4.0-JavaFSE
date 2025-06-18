package Week1.Algorithms_Data_Structures.EcommercePlatformSearchFunction;


import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo
{


    public static Product linearSearch(Product[] products, String name)
    {
        for (Product product : products)
        {
            if (product.productName.equalsIgnoreCase(name))
            {
                return product;
            }
        }
        return null;
    }


    public static Product binarySearch(Product[] products, String name)
    {

        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        int low = 0, high = products.length - 1;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);

            if (cmp == 0)
                return products[mid];
            else if (cmp < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Shoes", "Fashion"),
                new Product(3, "Watch", "Accessories"),
                new Product(4, "Phone", "Electronics"),
                new Product(5, "Bag", "Fashion")
        };

        System.out.println("Linear Search:");
        Product result1 = linearSearch(products, "Watch");
        System.out.println(result1 != null ? result1 : "Not Found");

        System.out.println("Binary Search:");
        Product result2 = binarySearch(products, "Watch");
        System.out.println(result2 != null ? result2 : "Not Found");
    }
}

