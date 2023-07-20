import java.util.ArrayList;
import java.util.List;

public class HotBeverageAutomat extends Automat {

    public Product getProduct(String name) {
        for (Product product : listProduct) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    List<HotBeverage> listHotBeverage = new ArrayList<>();

    public void initHotBeverage(List<HotBeverage> myList){
        listHotBeverage = myList;
    }

    public HotBeverage getProduct(String name, double volume, int temerature) {
        for (HotBeverage product : listHotBeverage) {
            if (product.getName().equals(name) && product.getVolume() == volume && product.getTemerature() == temerature) {
                return product;
            }
        }
        return null;
    }
}
