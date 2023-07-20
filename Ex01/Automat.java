// Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы initProducts (List <Product>) сохраняющий в себе 
// список исходных продуктов и getProduct(String name)

import java.util.ArrayList;
import java.util.List;

public class Automat {
    
    List<Product> listProduct = new ArrayList<>();

    public void initProducts(List<Product> myList) {
        listProduct = myList;
    }

    public Product getProduct(String name) {
        for (Product product : listProduct) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }



}